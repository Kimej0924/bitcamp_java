package com.bit.day15;

import java.util.HashMap;

public class Ex11 {

	public static void main(String[] args) {
		// Map
		java.util.HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value1");		//value���� �ߺ� ����

//		map.put("key1", 12234);			//key���� �ߺ��� ���� - �ߺ� �ÿ��� ������ �������� ��µ�
//		map.put(1234, true);			//key��, value���� ����,���� boolean,null ��� �ٵ����ִ�
//		map.put(null, 132452);			//���׸� ��Ʈ�� �ο��� ����3�� ���ڵ��� ������
		map.put(null, "�ٲ�");			
		System.out.println(map.get("key3"));
		System.out.println(map.get("key1"));
		System.out.println(map.get("key4"));
		System.out.println(map.get(null));		//�ش� null�� Ű�̸���- �������� �ٲ��� ȣ���
		System.out.println(map.get("����"));	//������ ȣ���ϸ� null��(����Ʈ��) ȣ���
		
		
	}

}
