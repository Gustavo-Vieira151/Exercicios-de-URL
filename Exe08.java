import java.util.Scanner;

public class Exe08{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Numero do funcionário: ");
	int Num= top.nextInt();
	System.out.println("Escreva o numero de horas trabalhadas: ");
	double Horas= top.nextDouble();
	System.out.println("Escreva o valor que recebe por horas: ");
	double Valor=top.nextDouble();
	double SALARIO= Valor * Horas;
	System.out.println(String.format("SALARIO=%.2f",SALARIO));
	

}
}