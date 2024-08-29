import java.util.Scanner;

class Desafio {
public static void main(String[] args) {
Scanner numero = new Scanner(System.in);
 System.out.println("Digite um número com três algarismos : ");
int valor = numero.nextInt();
int resto=0;        
resto=valor%10; 
valor=valor/10;
System.out.print(resto); 
resto=valor%10;
valor=valor/10;
System.out.print(resto);     
 System.out.print(valor);        
}
}
        