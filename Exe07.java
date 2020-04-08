import java.util.Scanner;

public class Exe07{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Valor numero A: ");
	int A= top.nextInt();
	System.out.println("Valor numero B: ");
	int B= top.nextInt();
	System.out.println("Valor numero C: ");
	int C= top.nextInt();
	System.out.println("Valor numero D: ");
	int D= top.nextInt();
	int DIFERENCA=(A*B-C*D);
	System.out.println("DIFERENCA = " + DIFERENCA);
}
}