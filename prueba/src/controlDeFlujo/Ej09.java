package controlDeFlujo;

import java.util.Scanner;

public class Ej09 {

	public static void main(String[] args) {
		int a=0, b = 0;
		Scanner entrada;
		do{
			entrada=new Scanner(System.in);
			System.out.println("Introduce un valor para a");
			try {
				a=entrada.nextInt();
			}catch(Exception e){
				System.err.println("Error");
				entrada = new Scanner(System.in);
			}
			entrada=new Scanner(System.in);
			System.out.println("Introduce un valor para b");
			try {
				b=entrada.nextInt();
			}catch(Exception e){
				System.err.println("Error");
				entrada = new Scanner(System.in);
			}
		}while(a == 0 || b == 0);
		if (a > b) {
			System.out.println("A es mayor que B");
			if (a%b==0) {
				System.out.println("A es divisible entre B");
			}else{
				System.out.println("A no es divisible entre B");
			}
		}else if (b > a) {
			System.out.println("B es mayor que A");
			if (b%a==0) {
				System.out.println("B es divisible entre A");
			}else{
				System.out.println("B no es divisible entre A");
			}
		}else{
			System.out.println("Los numeros son iguales");
		}
		
	}

}
