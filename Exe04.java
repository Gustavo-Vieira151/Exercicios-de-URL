import java.util.Scanner;
	
public class Exe04{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Valor 1:");
	int A= top.nextInt();
	System.out.println("Valor 2: ");
	int B= top.nextInt();
	int PROD= A*B;
	System.out.println("PROD= "+PROD);
}
}