package play;

import cliente.Fisica;
import cliente.Juridica;
import cliente.Pessoa;
import conta.Corrente;
import conta.Poupanca;
import javax.swing.JOptionPane;

public class BancoExe {
    public static void main(String[] args) {
        Fisica vetorPF[] = new Fisica[10];
        Juridica vetorPJ[] = new Juridica[10];
        Corrente vetorCC[] = new Corrente[10];
        Poupanca vetorCP[] = new Poupanca[10];
        int contVetorPF = 0;
        int contVetorPJ = 0;
        int contVetorCC = 0;
        int contVetorCP = 0;
        
        
        int opcao;
        do {
            opcao = Integer.parseInt(
            JOptionPane.showInputDialog(
                    "Digite uma opcao:\n"
                            + "1 - Inserir Pessoa Fisica.\n"
                            + "2 - Inserir Pessoa Juridica.\n"
                            + "3 - Inserir Conta Corrente.\n"
                            + "4 - Inserir Conta Poupanca.\n"
                            + "5 - Consultar Pessoa Fisica.\n"
                            + "6 - Consultar Pessoa Juridica.\n"
                            + "7 - Consultar Dados Conta Corrente.\n"
                            + "8 - Consultar Dados Conta Poupanca.\n"
                            + "9 - Para sair."));
            switch(opcao){
                case 1:
                    Fisica f = inserirPessoaFisica();
                    vetorPF[contVetorPF] = f;
                    contVetorPF++;
                case 2:
                    break;
                case 3:
                    Corrente c = inserirContaCorrente(vetorPF[0]);
                    vetorCC[contVetorCC] = c;
                    contVetorCC++;
                case 4:
                    break;
                case 5:
                    for (int i = 0; i < contVetorPF; i++) {
                        JOptionPane.showMessageDialog
                            (null, vetorPF[i]);
                    }
                case 6:
                    break;
                case 7:
                    for (int i = 0; i < contVetorCC; i++) {
                        JOptionPane.showMessageDialog
                            (null, vetorCC[i]);
                    }
                case 8:
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Opção Inválida!\n"
                            + "Tente novamente");
            }
        } while (opcao!=9);
    }
    
    
    public static Fisica inserirPessoaFisica(){
        Fisica f = new Fisica();
        f.setNome(JOptionPane.
                showInputDialog("Digite o nome do cliente: "));
        f.setEndereco(JOptionPane.
                showInputDialog("Digite o endereço do cliente: "));
        f.setEmail(JOptionPane.
                showInputDialog("Digite o e-mail do cliente: "));
        f.setTelefone(JOptionPane.
                showInputDialog("Digite o telefone do cliente: "));
        f.setCpf(JOptionPane.
                showInputDialog("Digite o CPF do cliente: "));
        return f;
    }
    
    public static Juridica inserirPessoaJuridica(){
        Juridica j = new Juridica();
        j.setNome(JOptionPane.
                showInputDialog("Digite o nome da empresa: "));
        j.setEndereco(JOptionPane.
                showInputDialog("Digite o endereço da empresa: "));
        j.setEmail(JOptionPane.
                showInputDialog("Digite o e-mail da empresa: "));
        j.setTelefone(JOptionPane.
                showInputDialog("Digite o telefone da empresa: "));
        j.setCnpj(JOptionPane.
                showInputDialog("Digite o CNPJ da empresa: "));
        return j;
    }
    
    public static Corrente inserirContaCorrente(Pessoa p){
        Corrente c = new Corrente();
        c.setAgencia("0001");
        c.setPessoa(p);
        c.setSaldo(0);
        
        c.setNroConta(JOptionPane.
                showInputDialog("Digite um número para a conta: "));
        c.setSenha(JOptionPane.showInputDialog("Digite uma senha:"));
        String credito = JOptionPane.
                showInputDialog
        ("Deseja Cartão de Crédito? (S)im ou (N)ão:");
        c.setCartaoCredito(false);
        if (credito.equals("S")){
            c.setCartaoCredito(true);
        }
        return c;
    }
    
    public static Poupanca inserirContaPoupanca(Pessoa p){
        Poupanca poupa = new Poupanca();
        poupa.setAgencia("0001");
        poupa.setPessoa(p);
        poupa.setSaldo(0);
        
        poupa.setNroConta(JOptionPane.
                showInputDialog("Digite um número para a conta: "));
        poupa.setSenha(JOptionPane.showInputDialog("Digite uma senha:"));
        
        return poupa;
    }

}
