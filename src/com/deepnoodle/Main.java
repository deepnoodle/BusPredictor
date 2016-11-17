package com.deepnoodle;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.deepnoodle.metro.service.MetroService;
import com.deepnoodle.scheduler.Repeater;
import com.deepnoodle.scheduler.RunOnce;
import com.deepnoodle.traffic.service.TrafficService;
import com.deepnoodle.weather.service.WeatherService;

@Component
public class Main {

	private static final Logger log = LogManager.getLogger(Main.class);

	@Autowired
	private MetroService metroService;

	@Autowired
	private TrafficService trafficService;

	@Autowired
	private WeatherService weatherService;

	@Autowired
	private MetroInputService metroInputService;

	private static Main main;

	public static void main(String[] args) {
		ApplicationContext applicationContext = null;
		try {
			//configure logging
			BasicConfigurator.configure();
			Logger.getRootLogger().setLevel(Level.INFO);

			log.info("configure spring");
			applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

			//TODO not sure the right way to do this, look into it.
			main = (Main) applicationContext.getBean("main");
			main.start();

			//TODO not sure the right way to do this, look into it.
			while (true) {
			}
		} catch (Exception e) {
			log.error(e);
		} finally {
			if (applicationContext != null) {
				((ConfigurableApplicationContext) applicationContext).close();
			}
		}

	}

	public void start() {
		startVehiclesForAgencyResultFetcherRepeater(20, 0);
		startTravelTimesFetcherRepeater(60, 10);
		startWeatherInfoFetcherRepeater(3600, 20);

		//Not currently needed.
		//startWeatherStationFetcherRepeater(60);

	}

	private void startVehiclesForAgencyResultFetcherRepeater(int secondsBetweenFetches, int startDelay) {
		RunOnce saveStopsForRouteRunOnce = new RunOnce();
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				try {
					boolean saveExtraData = saveStopsForRouteRunOnce.isHasRun();
					metroService.fetchAndSave(false, saveExtraData, saveExtraData, false);
					saveStopsForRouteRunOnce.setHasRun(true);
				} catch (Exception e) {
					log.error(e);
				}
			}
		};

		new Repeater(runnable, secondsBetweenFetches, startDelay);

	}

	private void startTravelTimesFetcherRepeater(int secondsBetweenFetches, int startDelay) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				trafficService.fetchAndSave();
			}

		};

		new Repeater(runnable, secondsBetweenFetches, startDelay);
	}

	private void startWeatherInfoFetcherRepeater(int secondsBetweenFetches, int startDelay) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				try {
					weatherService.fetchAndSaveWeatherInfo();
				} catch (Exception e) {
					log.error(e);
				}
			}

		};

		new Repeater(runnable, secondsBetweenFetches, startDelay);
	}

	private void startWeatherStationFetcherRepeater(int secondsBetweenFetches, int startDelay) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				try {
					weatherService.fetchAndSaveWeatherStations();
				} catch (Exception e) {
					log.error(e);
				}
			}

		};

		new Repeater(runnable, secondsBetweenFetches, startDelay);
	}

}
