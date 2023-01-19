package pratica;

/*Leia um vetor de 12 posições e em seguida 
ler também dois valores X e Y quaisquer correspondentes a 
duas posições no vetor. Ao final seu programa deverá escrever a 
soma dos valores encontrados nas respectivas posições X e Y.*/

public class vetores1 {

	public static void main(String[] args) {
		int array[] = new int[12];
		int x =1,y =2;
		array[2] = x;
		array[8] = y;
		System.out.println (array[2]+ array[8]);
	}

}
