package controlDeFlujo;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		int num = 0, suma = 0;
		while(suma<=50){
			Scanner entrada=new Scanner(System.in);
			System.out.println("Escribe un numero");
			try {
				num=entrada.nextInt();
			}catch(Exception e){
				System.err.println("Error");
				entrada = new Scanner(System.in);
			}
			suma += num;
		}
		System.out.println("La suma de los numero es: "+suma);

	}
}