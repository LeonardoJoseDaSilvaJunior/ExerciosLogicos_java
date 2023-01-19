package pratica;

/* Leia dois vetores de 20 posições e calcule um terceiro vetor contendo, nas
posições pares os valores do primeiro e nas posições impares os valores do segundo.*/

public class vetores7 {

	public static void main(String[] args) {
		int array[]  = new int [20];
		int array2[] = new int [20];
		int array3[] = new int [20];

		int valores = 5;
		for(int i = 0; i < array.length;i++) {
			array[i] = i;
			array2[i] = valores;
			valores += 5;
			if(i%2==0) {
				array3[i] = array[i];
			}
			else {
				array3[i] = array2[i];
			}
			System.out.println(array3[i]);
		}

	}

}
