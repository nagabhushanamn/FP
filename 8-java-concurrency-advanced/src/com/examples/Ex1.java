package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {

//		ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//		Callable<String> task1 = () -> {
//			System.out.println(Thread.currentThread().getName() + " -start");
//			TimeUnit.SECONDS.sleep(5);
//			System.out.println(Thread.currentThread().getName() + " -end");
//			return "im string";
//		};
//		Callable<String> task2 = () -> {
//			System.out.println(Thread.currentThread().getName() + " -start");
//			TimeUnit.SECONDS.sleep(2);
//			System.out.println(Thread.currentThread().getName() + " -end");
//			return "im too string";
//		};
//
//		List<Callable<String>> tasks = Arrays.asList(task1, task2);
//		List<Future<String>> futures = executorService.invokeAll(tasks);
//
//		for (Future<String> future : futures) {
//			try {
//				String result = future.get();
//				System.out.println(result);
//			} catch (ExecutionException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		

	}

}
