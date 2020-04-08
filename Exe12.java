import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.Math.pow;

public class Exe12{
	public static void main(String[] args){
	Scanner top= new Scanner(System.in);
	DecimalFormat form= new DecimalFormat("0.000");
	System.out.println("Base A do triângulo: ");
	double A= top.nextDouble();
	System.out.println("Altura C do triângulo: ");
	double C= top.nextDouble();
	double AreaTriangulo= (A*C)/2;
	System.out.println("Escreva o valor do raio do círculo:");
	float Raio= top.nextFloat();
	double Pi=3.14159;
	double AreaCirculo= Pi * Math.pow(Raio,2);
	System.out.println("Escreva a base maior trapézio: ");
	float BaseA= top.nextFloat();
	System.out.println("Escreva a base menor trapézio: ");
	float BaseB= top.nextFloat();
	System.out.println("Escreva a altura do trapézio: ");
	float Altura= top.nextFloat();
	double AreaTrapezio= ((BaseA + BaseB)/2) * Altura;
	System.out.println("Escreva o lado do quadrado: ");
	float LadoB= top.nextFloat();
	double AreaQuadrado= Math.pow(LadoB,2);
	System.out.println("Escreva a base lado A do retângulo: ");
	float Lado1= top.nextFloat();
	System.out.println("Escreva a altura do retângulo lado B: ");
	float Lado2= top.nextFloat();
	double AreaRetangulo= Lado1*Lado2;
	System.out.println("TRIANGULO:" + form.format(AreaTriangulo));
	System.out.println("CIRCULO:" + form.format(AreaCirculo));
	System.out.println("TRAPEZIO:" + form.format(AreaTrapezio));
	System.out.println("QUADRADO:" + form.format(AreaQuadrado));
	System.out.println("RETANGULO:" + form.format(AreaRetangulo));
	


}
}