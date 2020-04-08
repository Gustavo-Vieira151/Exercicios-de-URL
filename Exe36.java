import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.Math.sqrt;


public class Exe36{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	DecimalFormat form= new DecimalFormat("0.00000");
	System.out.println("Valor fluatuante A:");
	double A= top.nextDouble();
	System.out.println("Valor flutuante B:");
	double B= top.nextDouble();
	System.out.println("Valor flutuante C: ");
	double C= top.nextDouble();
	if((A==0) | (B*B - 4*A*C < 0)){
	System.out.println("Impossivel calcular");
}
	else{
	double R1= (-B + Math.sqrt(B*B - 4*A*C)) / (2*A);
	double R2= (-B - Math.sqrt(B*B - 4*A*C)) / (2*A);
	System.out.println("R1 = " + form.format(R1));
	System.out.println("R2 = " + form.format(R2));
}
}
}