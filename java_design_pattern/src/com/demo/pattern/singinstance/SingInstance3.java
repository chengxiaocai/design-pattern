package com.demo.pattern.singinstance;

public class SingInstance3 {
	//恶汉式样  容易产生垃圾对象
	private SingInstance3() {}
	private static SingInstance3 singInstance3 = new SingInstance3();
	public SingInstance3 getInstance() {
		return singInstance3;
	}

}
