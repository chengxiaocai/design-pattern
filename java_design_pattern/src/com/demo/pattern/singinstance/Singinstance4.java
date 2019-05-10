package com.demo.pattern.singinstance;

public class Singinstance4 {
	private Singinstance4() {
	}

	private Singinstance4 singinstance4;

	public Singinstance4 getInstance() {
		if (singinstance4 == null) {
			synchronized (Singinstance4.class) {
				if (singinstance4 == null) {
					singinstance4 = new Singinstance4();
				}
			}
		}
		return singinstance4;
	}

}
