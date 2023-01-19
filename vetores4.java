package pratica;

/* Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa
devera fazer uma busca do valor de X no vetor lido e informar a posição em que foi 
encontrado ou se não foi encontrado.*/

public class vetores4 {

	public static void main(String[] args) {
		int array[] = new int[20];
		int x = 19;
		int posicao = 0;
		for(int i = 0; i< array.length; i++){
			array[i] = i;
		}
		for(int i = 0; i< array.length; i++){
		
			if(array[i] == x){
				posicao = i;
				System.out.println("Valor encontrado. Posicao: " + posicao);
				break;
			}
		}
		if(array[posicao] != x){
			System.out.println("Valor inexistente");
		}
	}
}
