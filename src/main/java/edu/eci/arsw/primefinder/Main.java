package edu.eci.arsw.primefinder;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long seconds = 0;
		PrimeFinderThread pft=new PrimeFinderThread(0, 10000000);
		PrimeFinderThread pft2 = new PrimeFinderThread(10000001,20000000);
		PrimeFinderThread pft3 = new PrimeFinderThread(20000001,30000000);
		long start = System.currentTimeMillis();
		pft.start();
		pft2.start();
		pft3.start();

		while(seconds != 5000){
			System.out.println("passing time....");
			seconds = (System.currentTimeMillis() - start);
		}

		pft.setSuspend(true);
		pft2.setSuspend(true);
		pft3.setSuspend(true);


		System.out.println("Press Enter to Continue...");

		Scanner scanner = new Scanner(System.in);

		String in = scanner.nextLine();
		System.out.println(in + "This is IN");
		if (Integer.parseInt(in) == 1){
			System.out.println(in + "This is IN dentro");
			pft.resumeThread();
			pft2.resumeThread();
			pft3.resumeThread();
		}

		
	}
	
}
