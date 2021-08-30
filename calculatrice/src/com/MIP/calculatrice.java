package com.MIP;
import java.util.Scanner;

public class calculatrice {
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numberOne = 0;
		int numberTwo = 0;

		System.out.println("Entrer le premier nombre");
		numberOne = keyboard.nextInt();

		System.out.println("Entrer le second nombre");
		numberTwo = keyboard.nextInt();

		System.out.println("La somme de " + numberOne + " et " + numberTwo + "est de : " + (numberOne + numberTwo));
	}

}
