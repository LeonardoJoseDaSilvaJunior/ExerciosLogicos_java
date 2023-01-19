package pratica;

/*Leia um vetor do tipo String contendo alguns caracteres numericos. Em seguida
escreva esses caracteres, separadamente e por extenso.*/

import java.util.Scanner;
public class vetores8 {
	Scanner ler = new Scanner (System.in);
	String numero = ler.next();
	final int TAMANHO = numero.length();		
	char array[] = new char[TAMANHO];
	char caracter;
	for(int i = 0;i<TAMANHO;i++) {
		caracter = numero.charAt(i);
		array[i] = caracter;
		
		if(array[i] == '1'){
			System.out.print("um | ");
		}
		else if(array[i] == '2'){
			System.out.print("dois | ");
		}
		else if(array[i] == '3'){
			System.out.print("tres | ");
		}
		else if(array[i] == '4'){
			System.out.print("quatro | ");
		}
		else if(array[i] == '5'){
			System.out.print("cinco | ");
		}
		else if(array[i] == '6'){
			System.out.print("seis | ");
		}
		else if(array[i] == '7'){
			System.out.print("sete | ");
		}
		else if(array[i] == '8'){
			System.out.print("oito | ");
		}
		else if(array[i] == '9'){
			System.out.print("nove | ");
		}
	}	
    }
}
