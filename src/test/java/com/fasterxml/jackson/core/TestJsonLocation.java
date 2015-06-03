package com.fasterxml.jackson.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJsonLocation
{
	JsonLocation jsonLocation;

	@Before
	public void setUp() throws Exception
	{
		jsonLocation = new JsonLocation("N/A", -1L, -1L, -1, -1);
		
	}

	@Test
	public void testHashCode()
	{
		assertEquals(76480, jsonLocation.hashCode());
	}

	@Test
	public void testToString()
	{
		assertEquals("[Source: N/A; line: -1, column: -1]", jsonLocation.toString());
	}

}
