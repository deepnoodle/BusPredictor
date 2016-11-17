package com.deepnoodle.scheduler;

import static java.util.concurrent.TimeUnit.*;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public class Repeater {
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	private final int repeatSeconds;
	private final Runnable runnable;

	public Repeater(Runnable runnable, int repeatSeconds, int startDelay) {
		this.runnable = runnable;
		this.repeatSeconds = repeatSeconds;

		final ScheduledFuture<?> handler = scheduler.scheduleAtFixedRate(runnable, startDelay, repeatSeconds, SECONDS);

	}

	public ScheduledExecutorService getScheduler() {
		return scheduler;
	}

	public int getRepeatSeconds() {
		return repeatSeconds;
	}

	public Runnable getRunnable() {
		return runnable;
	}
}
