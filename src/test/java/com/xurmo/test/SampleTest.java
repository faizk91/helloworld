package com.xurmo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SampleTest {
	
	
	Sample sample;

	@Before
	public void setUp() throws Exception {
		
		sample = new Sample(1,"abc");
	}

	@After
	public void tearDown() throws Exception {
		sample = null;
	}

	@Test
	public void testSampleFunction() {
		int result = sample.fun(2);
		assertEquals(3, result);
	}

}
