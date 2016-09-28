package controlDeFlujo;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		int num = 0, suma = 0;
		Scanner entrada;
		do{
			entrada=new Scanner(System.in);
			System.out.println("Escribe un numero entre el 1 y el 10");
			try {
				num=entrada.nextInt();
			}catch(Exception e){
				entrada = new Scanner(System.in);
			}
			if (num > 10 || num < 1) {
				System.err.println("Error");
				entrada = new Scanner(System.in);
			}
		}while(num > 10 || num < 1);
	}
}
