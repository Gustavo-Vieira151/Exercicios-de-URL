import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe17{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	DecimalFormat form= new DecimalFormat("0.000");
	System.out.println("Tempo gasto na viagem em horas: ");
	double Horas= top.nextDouble();
	System.out.println("Velocidade média em km: ");
	double Km= top.nextDouble();
	double Litros= (Horas*Km)/12;
	System.out.println(form.format(Litros)+" litros");


}
}