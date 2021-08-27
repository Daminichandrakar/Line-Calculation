package com.bl.java;

public class LineCalculation {

	public static void main(String[] args) {
		double x1 = 5, y1 = 5, x2 = 5, y2 = 0;
		double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println(dist);
	}
}
