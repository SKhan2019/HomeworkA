package container;

import java.util.Scanner;

public class Container {
	
	public static void main(String[] agrs) {
		System.out.println("Please enter six whole numbers: ");
		
		Scanner container = new Scanner(System.in);
		
		int [] input = new int[6];
		
	for (int i=0; i<input.length; i++) {
		input[i] = container.nextInt();
		
	}
	System.out.println();
	System.out.println("You enterd: ");
	
	for (int j=0; j<input.length; j++) {
		
		System.out.println(input[j]);
	    container.close();
	
	
	
	
	}
	}
	}
