package controlDeFlujo;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		int a=0, b = 0;
		Scanner entrada;
		do{
			entrada=new Scanner(System.in);
			System.out.println("Introduce un numero para a entre 1 y 10");
			try {
				a=entrada.nextInt();
			}catch(Exception e){
				System.err.println("Error");
				entrada = new Scanner(System.in);
			}
			entrada=new Scanner(System.in);
			System.out.println("Introduce un numero para b entre 1 y 10");
			try {
				b=entrada.nextInt();
			}catch(Exception e){
				System.err.println("Error");
				entrada = new Scanner(System.in);
			}
		}while(a > 10 || a < 1 || b > 10 || b < 1);

		while(a > b || b > a){
			if (a > b) {
				System.out.println("*");
				b++;
			}
			if (b > a) {
				System.out.println("*");
				a++;
			}
		}
	}

}