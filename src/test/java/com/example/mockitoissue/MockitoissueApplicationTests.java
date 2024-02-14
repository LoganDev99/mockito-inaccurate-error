package com.example.mockitoissue;

import lombok.Value;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class MockitoissueApplicationTests {

	@Test
	void test() {
		MyService myService = mock(MyService.class);

		MyClass myClass1 = new MyClass(1);
		MyClass myClass2 = new MyClass("1");

		myService.myMethod(myClass1);
		verify(myService).myMethod(myClass2);
	}

}

class MyService {

	public void myMethod(MyClass myClass) {
		System.out.println(myClass);
	}
}

@Value
class MyClass {
	Object myValue;
}