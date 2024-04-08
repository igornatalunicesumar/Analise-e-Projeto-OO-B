
import javax.swing.JOptionPane;

public class Aula01GUI {
    //psvm + tab
    public static void main(String[] args) {
        float v1, v2;
        
        v1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor1: "));
        v2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor2: "));
        
        
        float soma = v1+v2;
        
        JOptionPane.showMessageDialog(null, "Soma = "+soma);
        
        
        
    }
     

}
