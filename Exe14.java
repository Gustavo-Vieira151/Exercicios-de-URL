import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe14{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	DecimalFormat form= new DecimalFormat("0.000");
	System.out.println("Distancia total percorrida em Km: ");
	int Km= top.nextInt();
	System.out.println("Litros gasto:");
	float Litros= top.nextFloat();
	double Consumo= Km/Litros;
	System.out.println("Consumo médio:"+ form.format(Consumo)+" km/1");
	

}
}