package pacote1;

public class Classe2 {
    public static void main(String[] args) {
        Classe1 c1 = new Classe1();
        c1.a = 10;
        c1.b = 23;
        c1.c = 20;
        System.out.println("A: "+c1.a);
        System.out.println("B: "+c1.b);
        System.out.println("C: "+c1.c);
        c1.setD(12);
        System.out.println("D: "+c1.getD());
    }
}
