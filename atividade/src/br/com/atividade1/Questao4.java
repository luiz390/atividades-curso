package br.com.atividade1;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("DIGITE UM NUMERO: ");
		numero = sc.nextInt();
		if(numero%  2 == 0) {
			System.out.println("� PAR");
		}
		else {
			System.out.println("� IMPAR");
		}

	}

}
