package com.demo.pattern.absfactory;

public class ObjectProducer {

	AbsFactory absFactory;

	AbsFactory getAbsFactory(String type) {

		if ("color".equals(type)) {
			absFactory = new ColorFactory();
		} else if ("fruit".equals(type)) {
			absFactory = new FruitFactory();
		}

		return absFactory;

	}
	public static void main(String[] args) {
		
		ObjectProducer objectProducer = new ObjectProducer();
		objectProducer.getAbsFactory("color");
		
	}

}
