import java.util.Scanner;

public class Exe02{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Escreva o valor do raio:");
	double Raio= top.nextDouble();
	double Area= 3.14159 * Math.pow(Raio,2);
	System.out.println(String.format("A=%.4f",Area));
	

}
}