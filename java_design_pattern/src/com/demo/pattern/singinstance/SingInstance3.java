package com.demo.pattern.singinstance;

public class SingInstance3 {
	//��ʽ��  ���ײ�����������
	private SingInstance3() {}
	private static SingInstance3 singInstance3 = new SingInstance3();
	public SingInstance3 getInstance() {
		return singInstance3;
	}

}
