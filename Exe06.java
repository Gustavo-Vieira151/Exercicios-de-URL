import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe06{
	
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	DecimalFormat form= new DecimalFormat("0.0");
        System.out.println("Escreva a 1ª nota");
	double A= top.nextDouble();
	System.out.println("Escreva a 2ª nota:");
	double B= top.nextDouble();
	System.out.println("Escreva a 3ª nota:");
	double C= top.nextDouble();
	double MEDIA= (A*2 + B*3 + C*5)/10;
	System.out.println("MEDIA=" + form.format(MEDIA)); 
}
}