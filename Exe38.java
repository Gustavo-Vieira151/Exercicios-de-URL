import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe38{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	DecimalFormat form= new DecimalFormat("0.00");
	System.out.println("Escolha o item abaixa baseado no código: ");
	System.out.println("1-Cachorro Quente- R$4.00");
	System.out.println("2-X-Salada- R$4.50");
	System.out.println("3-X-Bacon- R$5.00");
	System.out.println("4-Torrada simples- R$2.00");
	System.out.println("5-Refrigerante- R$1.50");
	int Codigo= top.nextInt();
	if(Codigo == 1){
	System.out.println("Escolha a quantidade do item: ");
	int QuantidadeCachorro= top.nextInt();
	double ValorTotal1= QuantidadeCachorro * 4.00;
	System.out.println("Total:"+ form.format(ValorTotal1));
}	else if(Codigo == 2){
	System.out.println("Escolha a quantidade do item: ");
	int QuantidadeSalada= top.nextInt();
	double ValorTotal2= QuantidadeSalada * 4.50;
	System.out.println("Total:"+ form.format(ValorTotal2));
}	else if(Codigo == 3){
	System.out.println("Escolha a quantidade do item: ");
	int QuantidadeBacon= top.nextInt();
	double ValorTotal3= QuantidadeBacon * 5.00;
	System.out.println("Total:"+ form.format(ValorTotal3));
}	else if(Codigo == 4){
	System.out.println("Escolha a quantidade do item: ");
	int QuantidadeTorrada= top.nextInt();
	double ValorTotal4= QuantidadeTorrada * 2.00;
	System.out.println("Total:"+ form.format(ValorTotal4));
}	else if(Codigo == 5){
	System.out.println("Escolha a quantidade do item: ");
	int QuantidadeRefrigerante= top.nextInt();
	double ValorTotal5= QuantidadeRefrigerante * 1.50;
	System.out.println("Total:"+ form.format(ValorTotal5));
}	else if((Codigo == 0) | (Codigo > 5)){
	System.out.println("Codigo não se encontrar nas tabelas referentes");
}
}
}