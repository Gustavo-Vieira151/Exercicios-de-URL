import java.util.Scanner;
public class Exe01{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	
	System.out.println("Escreva o valor do primeiro numero: ");
	int num1= top.nextInt();
	System.out.println("Escreva o valor do segundo numero: ");
	int num2= top.nextInt();
	int x= num1+num2;
	System.out.println("X= " + x);
}
}