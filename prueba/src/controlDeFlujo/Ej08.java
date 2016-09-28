package controlDeFlujo;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		int opt = 7;
		Scanner entrada;
		do{
			entrada=new Scanner(System.in);
			System.out.println("1. Opcion 1\n2. Opcion 2\n3. Opcion 3\n0. Salir");
			try {
				opt=entrada.nextInt();
			}catch(Exception e){
				System.err.println("Error");
				entrada = new Scanner(System.in);
			}

			switch(opt){
			case 0:
				System.out.println("Has salido, hasta pronto!");
				break;
			case 1:
				System.out.println("Has elegido la opcion 1");
				do{
					opt = 7;
					entrada=new Scanner(System.in);
					System.out.println("1. Opcion 1.1\n2. Opcion 1.2\n3. Opcion 1.3\n0. Salir");
					try {
						opt=entrada.nextInt();
					}catch(Exception e){
						System.err.println("Error");
						entrada = new Scanner(System.in);
					}

					switch(opt){
					case 0:
						break;
					case 1:
						System.out.println("Has elegido la opcion 1.1");
						break;
					case 2:
						System.out.println("Has elegido la opcion 1.2");
						break;
					case 3:
						System.out.println("Has elegido la opcion 1.3");
						break;
					}
				}while(opt < 0 || opt > 3);
				break;
			case 2:
				System.out.println("Has elegido la opcion 2");
				do{
					opt = 7;
					entrada=new Scanner(System.in);
					System.out.println("1. Opcion 2.1\n2. Opcion 2.2\n3. Opcion 2.3\n0. Salir");
					try {
						opt=entrada.nextInt();
					}catch(Exception e){
						System.err.println("Error");
						entrada = new Scanner(System.in);
					}

					switch(opt){
					case 0:
						break;
					case 1:
						System.out.println("Has elegido la opcion 2.1");
						break;
					case 2:
						System.out.println("Has elegido la opcion 2.2");
						break;
					case 3:
						System.out.println("Has elegido la opcion 2.3");
						break;
					}
				}while(opt < 0 || opt > 3);
				break;
			case 3:
				System.out.println("Has elegido la opcion 3");
				do{
					opt = 7;
					entrada=new Scanner(System.in);
					System.out.println("1. Opcion 3.1\n2. Opcion 3.2\n3. Opcion 3.3\n0. Salir");
					try {
						opt=entrada.nextInt();
					}catch(Exception e){
						System.err.println("Error");
						entrada = new Scanner(System.in);
					}

					switch(opt){
					case 0:
						break;
					case 1:
						System.out.println("Has elegido la opcion 3.1");
						break;
					case 2:
						System.out.println("Has elegido la opcion 3.2");
						break;
					case 3:
						System.out.println("Has elegido la opcion 3.3");
						break;
					}
				}while(opt < 0 || opt > 3);
				break;
			}
		}while(opt < 0 || opt > 3);
	}

}