
import javax.swing.JOptionPane;

public class TesteVetor {
    public static void main(String[] args) {
        float numeros[] = new float[5];
        int qtdeNumeros;
        float resultado;
        SomaVetor sv = new SomaVetor();
        
        qtdeNumeros = Integer.parseInt
            (JOptionPane.showInputDialog
            ("Digite a quantidade de números: "));
        if(qtdeNumeros>5){
            qtdeNumeros = 5;
        }
        
        for(int i=0; i<qtdeNumeros; i++){
            numeros[i] = Float.parseFloat(
                JOptionPane.showInputDialog("numeros["+i+"]:"));
        }
        
        resultado = sv.somaNumeros(numeros, qtdeNumeros);
        JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
        
    }
}
