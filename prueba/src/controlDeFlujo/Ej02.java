package controlDeFlujo;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		String s1="", s2="";
		for(int i=0;i<5;i++){
			Scanner entrada=new Scanner(System.in);
			System.out.println("Escribe una palabra");
			try {
				s1=entrada.next();
			}catch(Exception e){
				System.err.println("Error");
				entrada = new Scanner(System.in);
			}
			s2 += s1;
		}
		System.out.println(s2);

	}
}