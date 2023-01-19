package pratica;

/*10. Escreva um algoritmo que solicite ao usuário a entrada de 5 nomes,
e que exiba a lista desses nomes na tela. Após exibir essa lista, o programa 
deve mostrar também os nomes na ordem inversa em que o usuário os digitou, um por linha.*/

import java.util.ArrayList;
import java.util.Scanner;
public class vetores10 {
	
		public static void main(String []args){
			Scanner ler = new Scanner(System.in);
			ArrayList<String> lista = new ArrayList<String>();
			for(int i = 0; i< 5; i++) {			
				String nome = ler.next();
				lista.add(nome);
			}
			for(String nome: lista) {
				System.out.println(nome);
			}
			for(int i = 4; i >= 0; i-- ) {	
				System.out.println(lista.get(i));	
			}

	}

}
