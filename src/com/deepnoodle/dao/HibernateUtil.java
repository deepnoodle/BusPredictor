package com.deepnoodle.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.deepnoodle.metro.model.Agency;
import com.deepnoodle.metro.model.MetroLocation;
import com.deepnoodle.metro.model.Route;
import com.deepnoodle.metro.model.RouteStop;
import com.deepnoodle.metro.model.RouteStopKey;
import com.deepnoodle.metro.model.Stop;
import com.deepnoodle.metro.model.TripStatus;
import com.deepnoodle.metro.model.VehicleStatus;
import com.deepnoodle.traffic.model.TravelPoint;
import com.deepnoodle.traffic.model.TravelTime;
import com.deepnoodle.weather.model.WeatherInfo;
import com.deepnoodle.weather.model.WeatherStation;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			configuration.setProperty("hibernate.order_updates", "true");
			configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
			configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
			configuration.setProperty("hibernate.hbm2ddl.auto", "update");

			configuration.setProperty("hibernate.connection.url", "jdbc:mysql://127.0.0.1:3306/metro");
			configuration.setProperty("hibernate.connection.username", "root");
			configuration.setProperty("hibernate.connection.password", "temppass");

			addMetroEntites(configuration);
			addTrafficEntites(configuration);
			addWeatherEntites(configuration);

			return configuration.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			ex.printStackTrace();

		}
		return sessionFactory;
	}

	private static void addMetroEntites(Configuration configuration) {
		configuration.addAnnotatedClass(Route.class);
		configuration.addAnnotatedClass(Stop.class);
		configuration.addAnnotatedClass(VehicleStatus.class);
		configuration.addAnnotatedClass(Agency.class);

		configuration.addAnnotatedClass(MetroLocation.class);
		configuration.addAnnotatedClass(TripStatus.class);

		configuration.addAnnotatedClass(RouteStop.class);
		configuration.addAnnotatedClass(RouteStopKey.class);
	}

	private static void addTrafficEntites(Configuration configuration) {
		configuration.addAnnotatedClass(TravelTime.class);
		configuration.addAnnotatedClass(TravelPoint.class);
	}

	private static void addWeatherEntites(Configuration configuration) {
		configuration.addAnnotatedClass(WeatherStation.class);
		configuration.addAnnotatedClass(WeatherInfo.class);

	}

	private static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}
}
