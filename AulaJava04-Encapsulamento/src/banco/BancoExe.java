package banco;

import javax.swing.JOptionPane;

public class BancoExe {
    private static String nome, senha;
    private static float saldo;
    
    public static void main(String[] args) {
        nome = JOptionPane.showInputDialog
            ("Digite seu nome: ");            
        senha = JOptionPane.showInputDialog
            ("Digite sua senha: ");
        saldo = Float.parseFloat(
                JOptionPane.showInputDialog
            ("Digite o saldo inicial: "));  
        
        Conta cIgor = new Conta(nome, senha, saldo);
        Conta c2 = new Conta("Joao", "123", 145);
        
        JOptionPane.showMessageDialog
        (null, "Conta 1: "+cIgor.getNConta());
        
        JOptionPane.showMessageDialog
        (null, "Conta 2: "+c2.getNConta());
        
    }
}
