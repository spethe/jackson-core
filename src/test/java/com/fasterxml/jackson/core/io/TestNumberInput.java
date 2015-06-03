package com.fasterxml.jackson.core.io;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestNumberInput
{
	@Test
	public void testParseIntString()
	{
		assertEquals(10, NumberInput.parseInt("10"));
	}
	
	@Test
	public void testParseIntNegativeString()
	{
		assertEquals(-10, NumberInput.parseInt("-10"));
	}
	
	@Test(expected=NumberFormatException.class)
	public void testParseIntNaNString()
	{
		NumberInput.parseInt("-ii");
	}

	@Test
	public void testParseLongString()
	{
		assertEquals(473L,NumberInput.parseLong("473"));
	}
	
	@Test(expected=NumberFormatException.class)
	public void testParseLongInvalidString()
	{
		NumberInput.parseLong("jfksjd");
	}
	
	@Test
	public void testParseAsInt()
	{
		assertEquals(1,NumberInput.parseAsInt("1", 0));
	}
	
	@Test
	public void testParseAsIntReturnDefault()
	{
		assertEquals(0,NumberInput.parseAsInt("aaa", 0));
	}

	@Test
	public void testParseAsLong()
	{
		assertEquals(1L,NumberInput.parseAsLong("1", 0L));
	}
	
	@Test
	public void testParseAsLongReturningDefault()
	{
		assertEquals(0L,NumberInput.parseAsLong("ooo", 0L));
	}

	@Test
	public void testParseAsDouble()
	{
		assertEquals(1.0 ,NumberInput.parseAsDouble("1.0", 0.0),0.0);
	}
	
	@Test
	public void testParseAsDoubleInvalid()
	{
		assertEquals(0.0 ,NumberInput.parseAsDouble("jfdskljf", 0.0),0.0);
	}

	@Test
	public void testParseDouble()
	{
		assertEquals(0.0, NumberInput.parseDouble("0"),0.0);
	}
	
	@Test(expected=NumberFormatException.class)
	public void testParseDoubleInvalid()
	{
		NumberInput.parseDouble("fkjdsj;fk");
	}
}
