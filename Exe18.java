import java.util.Scanner;

public class Exe18{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
 	int numero100=0, numero50=0, numero20=0, numero10=0, numero5=0, numero2=0, numero1=1;
	System.out.println("Valor: ");
	int NUM= top.nextInt();
	int Valor= NUM;
	numero100= NUM/100;
	NUM %=100;
	numero50= NUM/50;
	NUM %=50;
	numero20= NUM/20;
	NUM %=20;
	numero10= NUM/10;
	NUM %=10;
	numero5= NUM/5;
	NUM %=5;
	numero2= NUM/2;
	NUM %=2;
	numero1=NUM;
	System.out.println(numero100+ " notas(s) de 100,00");
	System.out.println(numero50+ " notas(s) de 50,00");
	System.out.println(numero20+ " notas(s) de 20,00");
	System.out.println(numero10+ " notas(s) de 10,00");
	System.out.println(numero5+ " notas(s) de 5,00");
	System.out.println(numero2+ " notas(s) de 2,00");
	System.out.println(numero1+ " notas(s) de 1,00");
}
}