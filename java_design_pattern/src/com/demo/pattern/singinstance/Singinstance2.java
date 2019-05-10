package com.demo.pattern.singinstance;

public class Singinstance2 {
	
	//懒汉 线程不安全
	private Singinstance2() {
	}

	private static Singinstance2 singinstance2;

		public static Singinstance2 getInstance() {
	
			if (singinstance2 ==null) {
				singinstance2 = new Singinstance2();
	
			}
			return singinstance2;
	
		}

}
