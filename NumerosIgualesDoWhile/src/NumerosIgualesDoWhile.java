/* Escribir un programa que pida 2 numeros por consola de manera reiterada
		 * La ejecución del programa terminará cuando los numeros ingresados sean
		 * iguales.
		 * Nota: utilizar un ciclo Do-While
		 */ 


import java.util.Scanner;

public class NumerosIgualesDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner (System.in);
		int primer;
		int segundo;
		
		do 
		{
			System.out.println("Este programa va a detenerse cuando los números sean iguales.\n");
			System.out.println ("Por favor ingresa el primer número:");
			primer = ingreso.nextInt();
			System.out.println("Por favor ingresa el segundo número:");
			segundo = ingreso.nextInt();
		}
		while (primer != segundo); {
		
		//ingreso.close(); //Cerramos nuestro scanner para ya no recibir más datos *Buena práctica*
			
			System.out.println("Los números son iguales, por lo que hemos terminado.");
		}
	}
}
