package com.bit.day12;

public interface Inter02 {

	void func01();

}

interface Inter03 extends Inter02{		//interface 들끼리의 상속은 키워드 extends
	void func02();
}
interface Inter04 extends Inter02,Inter03{		//interface 들끼리는 다중상속 허용
	void func01();
}

