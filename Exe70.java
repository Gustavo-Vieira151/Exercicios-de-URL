import java.util.Scanner;

public class Exe70{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Escreva o valor inteiro: ");
	int Valor= top.nextInt();
	for(int i=Valor; i<Valor+12; i++){
		if(i % 2 == 1){
		System.out.println(i);
	}
}
	
}
}