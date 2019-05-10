package com.demo.pattern.absfactory;
public class FruitFactory  extends AbsFactory {

	@Override
	FruitIml getFruitFactory(String type) {
		// TODO Auto-generated method stub
		FruitIml fruitIml=null;
		if("apple".equals(type)) {
			fruitIml = new Apple();
		}else if("orange".equals(type)) {
			fruitIml = new Orange();
		}
		return fruitIml;
	}

	@Override
	ColorIml getColorFactory(String type) {
		// TODO Auto-generated method stub
		return null;
	}


}
