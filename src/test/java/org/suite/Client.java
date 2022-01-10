package org.suite;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Client {
	
	@Test
	public void tc21() {
		System.out.println("test21");
	}
	@Test
	public void tc22() {
		System.out.println("test22");
	}
	@Test
	public void tc23() {
		Assert.assertTrue(false);
		System.out.println("test23");
	}
	
	@Test
	@Ignore
	public void tc24() {
		System.out.println("test24");
	}
}
