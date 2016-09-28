package controlDeFlujo;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		int mes=0, bi = 0;
		boolean bisiesto = false;
		Scanner entrada;
		do{
			entrada=new Scanner(System.in);
			System.out.println("Introduce un numero con referencia al mes");
			try {
				mes=entrada.nextInt();
			}catch(Exception e){
				System.err.println("Error");
				entrada = new Scanner(System.in);
			}
			entrada=new Scanner(System.in);
			System.out.println("Introduce si el año es bisiesto (1 = si)");
			try {
				bi=entrada.nextInt();
			}catch(Exception e){
				System.err.println("Error");
				entrada = new Scanner(System.in);
			}
			if (bi == 1) {
				bisiesto = true;
			}
		}while(mes > 12 || mes < 1);
		
		switch(mes){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes " + mes + " tiene 31 dias");;
			break;

		case 4:
		case 6:
		case 9:
		case 11: 
			System.out.println("El mes " + mes + " tiene 30 dias");;
			break;
		case 2:
			if (bisiesto) {
				System.out.println("El mes " + mes + " tiene 29 dias");;
				break;
			}else{
				System.out.println("El mes " + mes + " tiene 28 dias");;
				break;
			}
		}
	}

}