package com.bit.day12;

public interface Inter02 {

	void func01();

}

interface Inter03 extends Inter02{		//interface �鳢���� ����� Ű���� extends
	void func02();
}
interface Inter04 extends Inter02,Inter03{		//interface �鳢���� ���߻�� ���
	void func01();
}

