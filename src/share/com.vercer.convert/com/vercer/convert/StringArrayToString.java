package com.vercer.convert;


public class StringArrayToString implements Converter<String[], String>
{

	@Override
	public String convert(String[] source)
	{
		return source[0];
	}

}
