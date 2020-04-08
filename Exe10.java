import java.util.Scanner;

public class Exe10{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Código Peça 1: ");
	int Codigo= top.nextInt();
	System.out.println("Numero Peça 1: ");
	int Numero= top.nextInt();
	System.out.println("Valor unitário de cada peça 1: ");
	double Peca= top.nextDouble();
	System.out.println("Código Peça 2: ");
	int Codigo2= top.nextInt();
	System.out.println("Numero Peça 2: ");
	int Numero2= top.nextInt();
	System.out.println("Valor unitário de cada peça 2: ");
	double Peca2= top.nextDouble();
	double Total= (Numero*Peca)+(Numero*Peca2);
	System.out.println(String.format("Valor a ser pago:%.2f",Total));

}
}