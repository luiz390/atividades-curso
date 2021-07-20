package br.com.atividade1;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mes;
		
		System.out.println("*******************");
		System.out.println("C A L E N D A R I O");
		System.out.println("*******************");
		System.out.println();
		System.out.print("DIGIE UM NUMERO PARA SABER O MÊS: " ); 
		mes = sc.nextInt();
		     
		     switch (mes) {
		            
		     case 1 :
		    	 System.out.println("JANEIRO");
		    	 break;
		     case 2:
		    	 System.out.println("FEVEREIRO");
		    	 break;
		     case 3:
		    	 System.out.println("MARÇO");
		    	 break;
		     case 4:
		    	 System.out.println("ABRIL");
		    	 break;
		     case 5:
		    	 System.out.println("MAIO");
		    	 break;
		     case 6:
		    	 System.out.println("JUNHO");
		    	 break;
		     case 7:
		    	 System.out.println("JULHO");
		    	 break;
		     case 8:
		    	 System.out.println("AGOSTO");
		    	 break;
		     case 9:
		    	 System.out.println("SETEMBRO");
		    	 break;
		     case 10:
		    	 System.out.println("OUTUBRO");
		    	 break;
		     case 11:
		    	 System.out.println("NOVEMBRO");
		    	 break;
		     case 12:
		    	 System.out.println("DEZEMBRO");
		     default:
		    	 System.out.println("NUMERO INESISTENTE:");
		    	 break;
		    	
		    	 
		     }

	}

}
