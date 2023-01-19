package pratica;

/*Leia um vetor de 40 posições e atribua valor 0 para todos os elementos que possuírem 
valores negativos.*/

public class vetores6 {

	public static void main(String[] args) {
		int array[] = new int [40];
		int contagem = 0;
		for(int i = 0; i < array.length;i++) {
			array[i] = i;
			if(array[i]%2 == 0) {
				array[i] = (i- i)-i;
			}
			System.out.println(array[i]);
		}
		for(int i = 0; i < array.length;i++) {
			if(array[i] < 0) {
				array[i] = 0;
			}
			System.out.println(array[i]);
		}

	}

}
