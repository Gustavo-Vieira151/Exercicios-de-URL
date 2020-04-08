import java.util.Scanner;


public class Exe37{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Escreva o valor: ");
	double Valor= top.nextDouble();
	if((Valor>=0) & (Valor<=25)){
	System.out.println("Intervalo [0,25]");
}  else	if((Valor>25) & (Valor<=50)){
	System.out.println("Intervalo [25,50]");
}   else if((Valor>50) & (Valor<=75)){
	System.out.println("Intervalo [50,75]");
}   else if((Valor>75) & (Valor<=100)){
	System.out.println("Intervalo [75,100]");
}    else{
	System.out.println("Fora de intervalo");
}

}
}