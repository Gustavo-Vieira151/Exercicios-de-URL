import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.Math.pow;

public class Exe11{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	DecimalFormat form= new DecimalFormat("0.000");
	System.out.println("Valor raio esfera: ");
	int Raio= top.nextInt();
	double Pi= 3.14159;
	double VOLUME= (4/3.0) * Pi * Math.pow(Raio,3);
	System.out.println("VOLUME= "+ form.format(VOLUME));
	

}
}