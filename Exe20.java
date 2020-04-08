import java.util.Scanner;

public class Exe20{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Escreva um valor inteiro: ");
	int Num= top.nextInt();
	int Ano= Num/365;
	int Meses= (Num % 365) / 30;
	int Dias=(Num % 365) % 30;
	System.out.println(Ano + " ano(s)");
	System.out.println(Meses + " mes(es)");
	System.out.println(Dias + " dia(s)");
	
}
}