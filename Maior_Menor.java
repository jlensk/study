package br.com.lensk.estudo;

public class Maior_Menor {
	public static void main(String args[]){
		int[] array = {3,9,1,8,2};
		
		int[] retornoMetodo = maiorMenor(array);
		System.out.println("Maior "+retornoMetodo[0]);
		System.out.println("Menor "+retornoMetodo[1]);
	}
	
	public static int[] maiorMenor(int[] numeros){
		int[] retorno = new int[2];
		
		int maior = numeros[0];
		int menor = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			if( numeros[i] > maior ){
				maior = numeros[i];
				continue;
			}
			
			if( numeros[i] < menor){
				menor = numeros[i];
			}
		}
		
		
		retorno[0] = maior;
		retorno[1]= menor;
		
		return retorno;
	}

}
