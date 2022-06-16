package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class exercicio6 {
public static void main(String[] args){
double A, B, C, pi, tri, cir, trap, qua, ret;
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
pi = 3.14159;
System.out.println("DIGITE OS SEGUINTES DADOS: ");

System.out.println(" ");
System.out.println(" ");
System.out.print("leia A = ");
A = sc.nextDouble();
System.out.print("leia B = ");
B = sc.nextDouble();
System.out.print("leia C = ");
C = sc.nextDouble();
System.out.println(" ");
System.out.println(" ");
System.out.println("agora calculando...... ");
System.out.println(" ");
System.out.println(" ");
System.out.println("área do trangulo reângulo que tem A por base e C por altura: ");
tri = (A*C)/2;
System.out.printf("%.3f%n",tri);
System.out.println("área do circulo de raio C: ");
cir = pi * (C = Math.pow(C, 2.0));//separei a raíz quadrada do C por meio de parênteses
System.out.printf("%.3f%n",cir);
System.out.println("área do trapézio que tem A e B por bases e C por altura: ");
trap = ((A+B)*C)/2;
System.out.printf("%.3f%n",trap);
System.out.println("área do quadrado que tem base B ");
qua = (B*B);
System.out.printf("%.3f%n",qua);
System.out.println("área do reângulo que tem lados A e B");
ret = (A*B);
System.out.printf("%.3f%n", ret);



	
	
	
}
}
