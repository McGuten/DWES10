package controlDeFlujo;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		String s1="";
		int num = -1;
		Scanner entrada;
		entrada=new Scanner(System.in);
		System.out.println("Introduce una palabra");
		s1=entrada.next();
		do {
			entrada=new Scanner(System.in);
			System.out.println("Introduce una opcion");
			System.out.println("1. Mostrar la palabra en minusculas\n2. Mostrar la palabra en mayusculas\n3. Dar la vuelta a la palabra\n0. Salir");
			entrada=new Scanner(System.in);
			num=entrada.nextInt();
			switch(num){
			case 0: 
				break;
			case 1:
				System.out.println(s1.toLowerCase());
				break;
			case 2:
				System.out.println(s1.toUpperCase());
				break;
			case 3:
				for (int i=s1.length()-1;i>=0;i--) {
					System.out.print(s1.charAt(i));
				}
				break;
			}
		}while(num < 0 || num > 3);
	}
}