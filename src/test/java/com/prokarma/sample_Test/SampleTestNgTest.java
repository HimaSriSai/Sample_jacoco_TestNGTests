package com.prokarma.sample_Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

import com.prokarma.sample_test_jacoco.Arthematics;

public class SampleTestNgTest {
  @Test
  public void test() {
		int sum = Arthematics.addMethod(2, 3);
		assertEquals(5, sum);
		int sum1 = Arthematics.addMethod(2, 3);
		assertNotNull(sum1);
		int sum2 =Arthematics.addMethod(-1, 3);
		assertEquals(2, sum2);
		int sum3=Arthematics.addMethod(-1, -3);
		assertEquals(-4, sum3);
		int sub=Arthematics.subMethod(4, 5);
		assertEquals(-1, sub);
		int sub1=Arthematics.subMethod(4, -6);
		assertEquals(10, sub1);
		int sub2=Arthematics.subMethod(-4, 1);
		assertEquals(-5, sub2);
		int sub3=Arthematics.subMethod(2, 2);
		assertEquals(0, sub3);
		int mul=Arthematics.mulMethod(2,2);
		assertEquals(4, mul);
		int mul1=Arthematics.mulMethod(2, -2);
		assertEquals(-4, mul1);
		int mul2=Arthematics.mulMethod(-2, 3);
		assertEquals(-6, mul2);
	}
	
}
