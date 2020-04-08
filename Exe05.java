import java.util.Scanner;

public class Exe05{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	int i=0;
	do{

	System.out.println("Escreva a primeira nota do aluno:");
	double A= top.nextDouble();
	System.out.println("Escreva segunda nota do aluno :");
	double B= top.nextDouble();
	double MEDIA= (A*3.5+B*7.5)/11;
	System.out.println("MEDIA: "+ MEDIA);
	i++;
}
	while(i<2);
}
}