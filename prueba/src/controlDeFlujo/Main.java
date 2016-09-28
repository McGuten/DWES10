package controlDeFlujo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dia=0;
		do{
			Scanner entrada=new Scanner(System.in);
			System.out.println("Introduce un numero con referencia al dia de la semana");
			try {
				dia=entrada.nextInt();
			}catch(Exception e){
				System.err.println("Error");
				entrada = new Scanner(System.in);
			}
		}while(dia > 7 || dia < 0);
		switch(dia){
		case 0:
			System.out.println("No has introducido ningun dato");
			break;
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6:
			System.out.println("Es un dia laborable");
			break;
		case 7:
			System.out.println("No es un dia laborable");
			break;
		}
	}

}
