package com.fasterxml.jackson.core.io;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNumberOutput {

	@Test
	public void testOutputIntIntCharArrayInt() 
	{
		assertEquals(6, NumberOutput.outputInt(100000, new char[12], 0));
	}
	
	@Test
	public void testOutputIntIntCharArrayIntLessThanAMillion() 
	{
		assertEquals(3, NumberOutput.outputInt(999, new char[12], 0));
	}
	
	@Test
	public void testOutputIntIntCharArrayIntHasBillion() 
	{
		assertEquals(9, NumberOutput.outputInt(100005000, new char[12], 0));
	}
	
	

	@Test
	public void testOutputIntIntByteArrayInt() 
	{
		assertEquals(9, NumberOutput.outputInt(100005000, new byte[12], 0));
	}
	
	@Test
	public void testOutputIntIntByteArrayIntLessThanMillion() 
	{
		assertEquals(2, NumberOutput.outputInt(22, new byte[12], 0));
	}
	
	@Test
	public void testOutputIntIntByteArrayIntGreaterThanMillion() 
	{
		assertEquals(7, NumberOutput.outputInt(1105000, new byte[12], 0));
	}
	
	@Test
	public void testToStringInt() 
	{
		assertEquals("127",NumberOutput.toString(127));
	}

	@Test
	public void testToStringLong() {
		assertEquals("1",NumberOutput.toString(1L));
	}
	
	@Test
	public void testToStringLongGreaterThanIntMax() 
	{
		assertEquals("10000000000",NumberOutput.toString(10000000000L));
	}

	@Test
	public void testToStringDouble() 
	{
		assertEquals("1.0",NumberOutput.toString(1.0));
	}

	@Test
	public void testToStringFloat() 
	{
		assertEquals("1.0",NumberOutput.toString(1.0));
	}

}
