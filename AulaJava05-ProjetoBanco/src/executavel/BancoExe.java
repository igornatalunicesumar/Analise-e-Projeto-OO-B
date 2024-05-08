package executavel;

import cliente.Fisica;
import cliente.Juridica;
import cliente.Pessoa;
import conta.Corrente;
import javax.swing.JOptionPane;

public class BancoExe {
    
    public static void main(String[] args) {
        
    }
    
    public static Fisica inserirPF(){
        Fisica f = new Fisica();
        f.setCpf(JOptionPane.
                showInputDialog("Digite o CPF do cliente: "));
        f.setNome(JOptionPane.
                showInputDialog("Digite o nome do cliente: "));
        f.setEndereco(JOptionPane.
                showInputDialog("Digite o endereço do cliente: "));
        f.setEmail(JOptionPane.
                showInputDialog("Digite o e-mail do cliente: "));
        f.setTelefone(JOptionPane.
                showInputDialog("Digite o telefone do cliente: "));
        return f;
    }
    
    public static Juridica inserirPJ(){
        Juridica j = new Juridica();
        j.setCnpj(JOptionPane.
                showInputDialog("Digite o CNPJ da empresa: "));
        j.setNome(JOptionPane.
                showInputDialog("Digite o nome da empresa: "));
        j.setEndereco(JOptionPane.
                showInputDialog("Digite o endereço da empresa: "));
        j.setEmail(JOptionPane.
                showInputDialog("Digite o e-mail da empresa: "));
        j.setTelefone(JOptionPane.
                showInputDialog("Digite o telefone da empresa: "));
        return j;
    }
    
    public static Corrente inserirCC(Pessoa p){
        Corrente c = new Corrente();
        c.setAgencia("0001");
        c.setSaldo(0);
        c.setP(p);
        c.setCartaoCredito(false);
        
        c.setNroConta(JOptionPane.
                showInputDialog("Digite o número da conta: "));
        
        c.setSenha(JOptionPane.
                showInputDialog("Digite a senha da conta: "));
        
        String cartao = JOptionPane.
                showInputDialog
        ("Deseja cartão de crédito (S)im ou (N)ão");
        if (cartao.equals("S")){
            c.setCartaoCredito(true);
        }
        
        
        
        
        
        return c;
    }
}
