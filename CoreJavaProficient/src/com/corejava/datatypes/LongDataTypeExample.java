package com.corejava.datatypes;

public class LongDataTypeExample {

	public static void main(String[] args) {
	
		int lightSpeed=186282;
		long days=1000;
		long seconds;
		long distance;
		
		seconds=days*24*60*60;
		distance=lightSpeed*seconds;
		
		System.out.println("In 1000 days, distance travelled by the light="+distance+ " miles");

	}

}
