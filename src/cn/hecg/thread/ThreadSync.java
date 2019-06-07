package cn.hecg.thread;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 功能：测试线程同步
 *
 * @author hecg
 * @version 2019年5月29日
 */
public class ThreadSync {

//	private static volatile long nextSerialNumber = 0;
//	public static synchronized long generateSerialNumber() {
//		return nextSerialNumber++;
//	}
	
//	private static long nextSerialNumber = 0;
//	public static long generateSerialNumber2() {
//		return nextSerialNumber++;
//	}

	private static AtomicLong nextSerialNumber = new AtomicLong();

	public static long generateSerialNumber3() {
		return nextSerialNumber.getAndIncrement();
	}
	
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(generateSerialNumber3());
				}
			});
			t.start();
			// TimeUnit.SECONDS.sleep(1);
		}

	}

}
