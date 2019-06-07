package cn.hecg.thread;

import java.util.concurrent.TimeUnit;

/**
 * 功能：测试线程同步
 *
 * @author hecg
 * @version 2019年5月29日
 */
public class StopThread {
	private static boolean stopRequested;
	
	private static synchronized void requestStop() {
		stopRequested = true;
	}
	
	private static synchronized boolean stopRequested() {
		return stopRequested;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread backgroundThread = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while(!stopRequested()) {
					i++;
					System.out.println(i);
				}
			}
		});
		backgroundThread.start();
	
		TimeUnit.SECONDS.sleep(1);
		requestStop();
	}
}
