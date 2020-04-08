import java.util.Scanner;
import static java.lang.Math.abs;


public class Exe13{
	public static void main (String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Digite o valor: ");
	int A= top.nextInt();
	System.out.println("Digite o valor: ");
	int B= top.nextInt();
	System.out.println("Digite o valor: ");
	int C= top.nextInt();
	int MaiorAB=(A+B+Math.abs(A-B))/2;
	MaiorAB=(MaiorAB + C + Math.abs(MaiorAB - C))/2;
	System.out.println(MaiorAB+" eh o maior");
}
}