package com.mkyong.app;

import com.mkyong.client.HelloWorld;
import com.mkyong.client.HelloWorldImplService;

public class Application {

	public static void main(String[] args) {
		
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();

		System.out.println(hello.getHelloWorldAsString("mkyong"));
	              

	}

}
