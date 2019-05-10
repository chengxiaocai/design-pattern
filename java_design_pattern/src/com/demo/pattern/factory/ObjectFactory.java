package com.demo.pattern.factory;

public class ObjectFactory {
	public FruitIml getFruit(String type) {

		FruitIml fruitIml = null;
		if ("apple".equals(type)) {
			fruitIml = new Apple();
		} else if ("orange".equals(type)) {
			fruitIml = new Orange();
		}

		return fruitIml;

	}

	public static void main(String[] args) {
		ObjectFactory factory = new ObjectFactory();
		FruitIml fruitIml = factory.getFruit("apple");
		String name = fruitIml.getFruit();
		System.out.println(name);

	}

}
