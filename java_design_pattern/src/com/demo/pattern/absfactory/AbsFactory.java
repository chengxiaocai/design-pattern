package com.demo.pattern.absfactory;

public abstract class AbsFactory {
	abstract FruitIml getFruitFactory(String type);

	abstract ColorIml getColorFactory(String type);

}
