package com.demo.pattern.singinstance;

public class Singinstance1 {

	private Singinstance1() {
	};

	private static final class SinginstanceInner {
		private static Singinstance1 SINGINSTANCE = new Singinstance1();
	}

	public Singinstance1 getInstance() {
		return SinginstanceInner.SINGINSTANCE;
	}

}
