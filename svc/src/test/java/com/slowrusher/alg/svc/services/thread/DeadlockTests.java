package com.slowrusher.alg.svc.services.thread;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: C02900
 * Date: 5/29/13
 * Time: 4:14 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class DeadlockTests {
	@Autowired
	private DeadlockService deadlockService;

	@Test
	public void testDeadLock() {
		Thread deadlockThread = new Thread(new Runnable() {
			@Override
			public void run() {
				deadlockService.activateDeadLock();
			}
		});

		deadlockThread.run();

		try {
			Thread.sleep(1000);
			Assert.assertEquals(deadlockService.getA1(), "a1");
			Assert.assertEquals(deadlockService.getA2(), "a2");
		} catch (InterruptedException e) {
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
			assert true;
		} finally {

		}

	}
}
