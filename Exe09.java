import java.util.Scanner;

public class Exe09{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Escreva o nome do vendedor:");
	String Nome= top.nextLine();
	System.out.println("Digite seu sal�rio fixo:");
	double Salario= top.nextDouble();
	System.out.println("Total de vendas efetuadas em dinheiro: ");
	double Vendas= top.nextDouble();
	double Total= (Salario+(Vendas*0.15));
	System.out.println(String.format("Valor total receber final do m�s= %.2f",Total));
	
}
}