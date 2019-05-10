package com.demo.pattern.absfactory;

public class ColorFactory extends AbsFactory {

	@Override
	FruitIml getFruitFactory(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	ColorIml getColorFactory(String type) {
		// TODO Auto-generated method stub
		ColorIml colorIml = null;
		if ("red".equals(type)) {
			colorIml = new Red();

		} else if ("orange".equals(type)) {
			colorIml = new Blue();
		}
		return colorIml;
	}

}
