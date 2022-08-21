package utiles;

import java.util.Scanner;

public class Utiles {
	public static Scanner s = new Scanner(System.in);


	public static int ingresarEntero(int min, int max) {
		// TODO Auto-generated method stub
		boolean error = true;
		int entero = 0;
		do {
			try {
				entero = s.nextInt();
				if (entero >= min && entero <= max) {
					error = false;
				} else {
					System.out.println("Ingrese un numero que se encuentre en el rango de " + min + " y " + max);
				}
			} catch (Exception e) {
				System.out.println("Error de programa");
			}
		} while (error);
		return entero;
	}
	
	public static void esperar(int milisecs) {
		try {
			Thread.sleep(milisecs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
