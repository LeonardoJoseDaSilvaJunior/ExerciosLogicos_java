package pratica;
//Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui.
public class vetores5 {

	public static void main(String[] args) {
		int array[] = new int [40];
		int contagem = 0;
		for(int i = 0; i < array.length;i++) {
			array[i] = i;
		}
		for(int i = 0; i < array.length;i++) {
			if(array[i]%2 == 0) {
				contagem++;
				
			}
		}
	}
}
