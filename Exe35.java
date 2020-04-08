import java.util.Scanner;

public class Exe35{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Informe o valor de A: ");
	int A= top.nextInt();
	System.out.println("Informe o valor de B: ");
	int B= top.nextInt();
	System.out.println("Informe o valor de C: ");
	int C= top.nextInt();
	System.out.println("Informe o valor de D: ");
	int D= top.nextInt();
	if((B>C) & (D>A) & ((C+D) > (A+B)) & (C>0 & D>0) & (A % 2 == 0)){
	System.out.println("Valores aceitos");
}	
	else{
	System.out.println("Valores não aceitos");
}

}
}