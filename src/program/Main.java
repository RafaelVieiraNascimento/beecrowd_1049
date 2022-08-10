package program;

/*
beecrowd | 1049 - Animal

Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.

			       - carnivoro - aguia
			       |
		    - ave -|
		   	|	   |
		    |	   - onivoro - pomba
vertebrado -|      
		    |		    - onivoro - homem
		    |		    |
		    - mamifero -|
		   			    |
		   			    - herbivoro - vaca
		   
				        - hematofago - pulga
			            |
		      - inseto -|
		   	  |	        |
		      |	        - herbivoro - lagarta
invertebrado -|      
		      |		      - hematofago - sanguessuga
		      |		      |
		      - anelideo -|
		   			      |
		   			      - onivoro - minhoca	   
		   
Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palavra1 = sc.next();
		String palavra2 = sc.next();
		String palavra3 = sc.next();

		if (palavra1.equals("vertebrado")) {
			if (palavra2.equals("ave")) {
				if (palavra3.equals("carnivoro")) System.out.println("aguia");
				else System.out.println("pomba");
			}

			else {
				if (palavra3.equals("onivoro")) System.out.println("homem");
				else System.out.println("vaca");
			}
		}

		else {
			if (palavra2.equals("inseto")) {
				if (palavra3.equals("hematofago")) System.out.println("pulga");
				else System.out.println("lagarta");
			}

			else {
				if (palavra3.equals("hematofago")) System.out.println("sanguessuga");
				else System.out.println("minhoca");
			}
		}
		sc.close();
	}
}
