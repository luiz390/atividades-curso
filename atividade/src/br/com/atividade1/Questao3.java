package br.com.atividade1;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		   int n1,n2;
		   double soma1,soma2;
		   
		   System.out.print("DIGITE O PRIMEIRO NUMERO: ");
		   n1 = sc.nextInt();
		   System.out.println();
           System.out.print("DIGITE O SEGUNDO NUMERO: ");
           n2 = sc.nextInt();
           System.out.println();
           soma1 = (n1 + n2);
           soma2 = (n1 * n2);
           System.out.println(soma1);
           System.out.println(soma2);
           
           if(soma1 == soma2) {
        	   System.out.println("igual");
           }
           else {
        	   System.out.println("diferente");
           }
	}

}
