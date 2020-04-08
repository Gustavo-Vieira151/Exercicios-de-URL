import java.util.Scanner;
import static java.lang.Math.pow;
import java.text.DecimalFormat;

public class Exe15{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	DecimalFormat form= new DecimalFormat("0.00");
	System.out.println("Escreva os pontos do plano p1(x1,y1): ");
	double X1= top.nextDouble();
	double Y1= top.nextDouble();
	System.out.println("Escreva os pontos do plano p2(x2,y2): ");
	double X2= top.nextDouble();
	double Y2= top.nextDouble();
	double Distancia= Math.pow(Math.pow(X2 - X1,2)+ Math.pow(Y2 - Y1,2),0.5);
	System.out.println(form.format(Distancia));
}
}