
package com.in28minutes.api.j;

import java.util.concurrent.TimeUnit;

public class SleepingThread implements Runnable {

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
