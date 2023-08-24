package Unidade01;
import java.util.*;
class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		//declaração de variaveis
		int num1, num2, soma;
		
		//Leituras
		System.out.print("Digite um número");
		num1 = sc.nextInt();
		System.out.print("Digite outro numero");
		num2 = sc.nextInt();
		
		//Somar
		soma = num1 + num2;
		
		//mostrar na tela
		System.out.print("Soma:" + soma);
	}
}
