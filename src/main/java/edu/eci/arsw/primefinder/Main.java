package edu.eci.arsw.primefinder;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long seconds = 0;
		List<PrimeFinderThread> threads = new ArrayList<PrimeFinderThread>();
		PrimeFinderThread pft=new PrimeFinderThread(0, 10000000);
		threads.add(pft);
		PrimeFinderThread pft2 = new PrimeFinderThread(10000001,20000000);
		threads.add(pft2);
		PrimeFinderThread pft3 = new PrimeFinderThread(20000001,30000000);
		threads.add(pft3);
		long start = System.nanoTime();
		for (PrimeFinderThread pf: threads) {
			pf.start();
		}

		while(seconds != 5000){

			seconds = (System.nanoTime() - start)/1000000;
		}
		for (PrimeFinderThread pf: threads) {
			pf.setSuspend(true);

		}

		System.out.println("Press Enter to Continue...");

		Scanner scanner = new Scanner(System.in);

		String in = scanner.nextLine();
		if (in.equals("")){
			for (PrimeFinderThread pf: threads) {
				pf.resumeThread();
			}
		}

		
	}
	
}
