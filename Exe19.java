import java.util.Scanner;

public class Exe19{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	System.out.println("Informa o tempo de duração de segundos: ");
	int Valor= top.nextInt();
	int Horas= Valor/3600;
	int Minutos=(Valor%3600)/60;
	int Segundos=(Valor%3600) % 60;	
	System.out.println(Horas+ ":" + Minutos + ":" + Segundos);
	

}
}