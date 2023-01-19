package pratica;

/*Leia um vetor de 16 posições e troque os 8 primeiros
valores pelos 8 últimos e vice-e-versa. Escreva ao final o vetor obtido.*/

public class vetores3 {

	public static void main(String[] args) {
		int array[] = new int [16];
		
		int ultimos = 8;
		int a,b;
		for(int i = 0; i < array.length;i++) {
			array[i] = i;
		}
		for(int i = 0; i< 8;i++) {
			
			a = array[i];
			b = array[ultimos];
			array[i] =b;
			array[ultimos] = a;
			ultimos++;
		}
		for(int i = 0; i< array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
