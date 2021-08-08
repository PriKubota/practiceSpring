package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.example.app.Calculator;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class HajibootDiApplication {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Enter 2 numbers like 'a b':");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		Calculator calculator = context.getBean(Calculator.class);
		int result = calculator.calc(a, b);

		System.out.println("result =" + result);
	}

}
