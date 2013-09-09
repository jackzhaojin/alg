package com.slowrusher.alg.svc.services.thread;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: C02900
 * Date: 5/29/13
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class DeadlockServiceImpl implements DeadlockService {

	private String a1 = "a1";
	private String a2 = "a2";

	@Override
	public void activateDeadLock() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				lock12();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				lock21();
			}
		});

		t1.start();
		t2.start();

	}

	private void lock12() {
		synchronized (a1) {
			sleep();
			synchronized (a2) {
				// should not happen
				a2 = "a4";
			}
		}
	}

	private void lock21() {
		synchronized (a2) {
			sleep();
			synchronized (a1) {
				// should not happen
				a1 = "a3";
			}
		}
	}

	private void sleep() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getA1() {
		return a1;
	}

	@Override
	public String getA2() {
		return a2;
	}
}
