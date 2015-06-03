package com.fasterxml.jackson.core;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class Base64VariantTest extends TestCase
{
	Base64Variant base64Variant;
	
	@Before
	public void setUp()
	{
		base64Variant = new Base64Variant("MODIFIED-FOR-URL", Base64Variants.STD_BASE64_ALPHABET.toString(), false, Base64Variant.PADDING_CHAR_NONE, Integer.MAX_VALUE);
	}
	

	@Test
	public void testDecodeBase64CharChar()
	{
		assertEquals(26,base64Variant.decodeBase64Char('a'));
	}

	@Test
	public void testDecodeBase64CharInt()
	{
		assertEquals(-1, base64Variant.decodeBase64Char(1));
	}
	
	@Test
	public void testEncodeBase64Chunk()
	{
		char[] buffer = {'a','a','a','a'};
		assertEquals(4,base64Variant.encodeBase64Chunk(1,buffer , 0));
	}

	
}
