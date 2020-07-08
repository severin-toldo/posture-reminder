package com.stoldo.posture_reminder;

import java.util.Timer;
import java.util.TimerTask;

import notify.Notify;

public class PostureReminder {
	
	private static final int DEFAULT_INTERVAL_IN_MINS = 5;
	
	public static void main(String[] args) throws Exception {
		
		int interval = DEFAULT_INTERVAL_IN_MINS;
		
		if (args.length > 0) {
			interval = Integer.parseInt(args[0]); 	
		}
		
		Timer timer = new Timer();
		TimerTask t = new TimerTask() {
			@Override
			public void run() {
				Notify.notify("Posture", "");
			}
		};
		
		timer.schedule(t, 0, interval * 60000);
	}
}
