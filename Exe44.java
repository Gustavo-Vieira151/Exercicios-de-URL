import java.util.Scanner;

public class Exe44{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Insira os valores a baixo para saber se s�o multiplos ou n�o");
	System.out.println("Valores A: ");
	int A= top.nextInt();
	System.out.println("Valores B: ");
	int B= top.nextInt();
	if((A % B == 0) | (B % A == 0)){
	System.out.println("S�o m�ltiplos");
}	else{
	System.out.println("N�o s�o m�ltiplos");
}
}
}