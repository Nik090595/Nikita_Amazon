package com.Utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static String getDate() {
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime now = LocalDateTime.now();
		String S = d.format(now);
		return S;
	}
	
	public static void main(String[] args) {
		String Time = Date.getDate();
		System.out.println(Time);
	}
}
