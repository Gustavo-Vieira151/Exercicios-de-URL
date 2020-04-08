import java.util.Scanner;
import java.text.DecimalFormat;


public class Exe64{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	DecimalFormat form= new DecimalFormat("0.0");
	int Positivos=0;
	double Soma=0;
	for(int I=0; I<6 ; I++){
		System.out.println("Escreva 6 valores a baixo: ");
		double Numero= top.nextDouble();
		if(Numero > 0){
		Positivos++;	
		Soma+=Numero;
		}	
	}
	double Media= Soma/Positivos;
	System.out.println(Positivos+ " valores positivos");
	System.out.println("Media: "+ form.format(Media));
    }
}