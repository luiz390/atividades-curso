package br.com.atividade1;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		    int nume;
		    
		    
		  System.out.print("DIGITE UM NUMERO: ");
		  nume = sc.nextInt();
		  System.out.print("DIGITE UM NOME: ");
		  String nome = sc.nextLine();
		 
		  for(int i=0;i < nume;i++) {
			  nome = nome + 1;
			  System.out.println(i +" = "+ nome);
			  
		  }
		  
		  
		    	
		    

	}

}
