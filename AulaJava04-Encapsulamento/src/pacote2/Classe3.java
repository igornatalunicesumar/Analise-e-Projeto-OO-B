package pacote2;

import pacote1.Classe1;

public class Classe3 {
    public static void main(String[] args) {
        Classe1 c1 = new Classe1();
        c1.a = 10;
        c1.setD(11);
        System.out.println(c1.getD());
    }
}
