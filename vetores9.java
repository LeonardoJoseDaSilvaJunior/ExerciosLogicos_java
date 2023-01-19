package pratica;

/*Considere um vetor de trajetórias de 9 elementos, onde cada elemento possui o valor do
próximo elemento do vetor a ser lido.                    

Índice       1    2    3    4    5    6    7     8     9                      
Valor       5    7    6    9     2   8    4     0     3            
Assim, a seqüência da leitura seria 1, 5, 2, 7, 4, 9, 3, 6, 8, 0            

Faça um algoritmo que seja capaz de ler esse vetor e seguir a trajetória.*/

public class vetores9 {
	public static void main(String []args) {
		int indice[] = {1,2,3,4,5,6,7,8,9};
		int valor [] = {5,7,6,9,2,8,4,0,3};
		
		for(int i = 0; i<indice.length;i++) {
			if(i<=2) {
				System.out.print(indice[i] +" , "+ valor [i] + " , ");
			}
			else if(indice[i] == 4) {
				System.out.print(indice[i] +" , "+ valor [i] + " , ");
				System.out.print(indice[3] +" , "+ valor [3] + " , ");
			}
			else if(indice[i] == 8) {
				System.out.print(indice[i] +" , "+ valor [i] );
			}
		}
	}
}
