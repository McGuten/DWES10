package controlDeFlujo;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {
		int num = 0, num2 = 0, fact = 1;
		Scanner entrada;
		do{
			entrada=new Scanner(System.in);
			System.out.println("Introduce un numero");
			try {
				num=entrada.nextInt();
				num2=num;
			}catch(Exception e){
				System.err.println("Error");
				entrada = new Scanner(System.in);
			}
		}while(num <= 0);
		//Do-While
		do{
			fact *= num;
			num--;
		}while(num >= 1);
		System.out.println("(Do-While)El numero factorial de "
				+ num2 + " es " + fact);
		fact=1;
		num = num2;
		//While
		while(num >= 1){
			fact *= num;
			num--;
		}
		System.out.println("(While)El numero factorial de "
				+ num2 + " es " + fact);
		fact=1;
		num = num2;
		//For
		for(int i=num;i>=1;i--){
			fact *= num;
			num--;
		}
		System.out.println("(For)El numero factorial de "
				+ num2 + " es " + fact);
	}

}
