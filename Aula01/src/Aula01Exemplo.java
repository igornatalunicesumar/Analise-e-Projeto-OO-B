import java.util.Scanner;

public class Aula01Exemplo {
    //psvm + tab
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float v1, v2;
        
        //sout + tab
        System.out.println("Digite o valor1: ");
        v1 = entrada.nextFloat();
        
        System.out.println("Digite o valor2: ");
        v2 = entrada.nextFloat();
        
        float soma = v1+v2;
        System.out.println("Soma = "+soma+"!");
        
        
    }
     

}
