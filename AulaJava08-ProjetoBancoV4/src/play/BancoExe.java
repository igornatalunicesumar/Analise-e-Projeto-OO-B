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
                            + "9 - Deletar Conta Corrente.\n"
                            + "10 - Deletar Pessoa Física.\n"
                            + "11 - Para sair."));
            switch(opcao){
                case 1:
                    Fisica f = inserirPessoaFisica();
                    vetorPF[contVetorPF] = f;
                    contVetorPF++;
                    break;
                case 2:
                    Juridica j = inserirPessoaJuridica();
                    vetorPJ[contVetorPJ] = j;
                    contVetorPJ++;
                    break;
                case 3:                    
                    String nome = JOptionPane.showInputDialog
                    ("Digite o nome do cliente: ");
                    String tipoCliente = JOptionPane.showInputDialog
                    ("Digite F para Pessoa Fisica\n"
                            + "Digite J para Pessoa Juridica: ");
                    
                    int pos = -1;
                    boolean achouF = false;
                    boolean achouJ = false;
                    
                    if (tipoCliente.equals("F")){
                        for (int i = 0; i < contVetorPF; i++) {
                            if (nome.equals(vetorPF[i].getNome())){
                                pos = i;
                                achouF = true;
                            }
                        }
                    } else if (tipoCliente.equals("J")){
                        for (int i = 0; i < contVetorPJ; i++) {
                            if (nome.equals(vetorPJ[i].getNome())){
                                pos = i;
                                achouJ = true;
                            }
                        }
                    } 
                    
                    if(achouF){
                        Corrente c = inserirContaCorrente(vetorPF[pos]);
                        vetorCC[contVetorCC] = c;
                        contVetorCC++;
                    }else if (achouJ){
                        Corrente c = inserirContaCorrente(vetorPJ[pos]);
                        vetorCC[contVetorCC] = c;
                        contVetorCC++;
                    } else {
                        JOptionPane.showMessageDialog
                        (null, "Cliente não encontrado!");
                    }
                    
                    break;
                case 4:
                    String nome1 = JOptionPane.showInputDialog
                    ("Digite o nome do cliente: ");
                    String tipoCliente1 = JOptionPane.showInputDialog
                    ("Digite F para Pessoa Fisica\n"
                            + "Digite J para Pessoa Juridica: ");
                    
                    int pos1 = -1;
                    boolean achouF1 = false;
                    boolean achouJ1 = false;
                    
                    if (tipoCliente1.equals("F")){
                        for (int i = 0; i < contVetorPF; i++) {
                            if (nome1.equals(vetorPF[i].getNome())){
                                pos1 = i;
                                achouF1 = true;
                            }
                        }
                    } else if (tipoCliente1.equals("J")){
                        for (int i = 0; i < contVetorPJ; i++) {
                            if (nome1.equals(vetorPJ[i].getNome())){
                                pos1 = i;
                                achouJ1 = true;
                            }
                        }
                    } 
                    
                    if(achouF1){
                        Poupanca p = inserirContaPoupanca(vetorPF[pos1]);
                        vetorCP[contVetorCP] = p;
                        contVetorCC++;
                    }else if (achouJ1){
                        Poupanca p = inserirContaPoupanca(vetorPJ[pos1]);
                        vetorCP[contVetorCP] = p;
                        contVetorCC++;
                    } else {
                        JOptionPane.showMessageDialog
                        (null, "Cliente não encontrado!");
                    }
                    break;
                case 5:
                    for (int i = 0; i < contVetorPF; i++) {
                        JOptionPane.showMessageDialog
                            (null, vetorPF[i]);
                    }
                    break;
                case 6:
                    for (int i = 0; i < contVetorPJ; i++) {
                        JOptionPane.showMessageDialog
                            (null, vetorPJ[i]);
                    }
                    break;
                case 7:
                    for (int i = 0; i < contVetorCC; i++) {
                        JOptionPane.showMessageDialog
                            (null, vetorCC[i]);
                    }
                    break;
                case 8:
                    for (int i = 0; i < contVetorCP; i++) {
                        JOptionPane.showMessageDialog
                            (null, vetorCP[i]);
                    }
                    break;
                case 9:
                    String nome_conta = JOptionPane.showInputDialog
                    ("Digite o nome do titular da conta corrente: ");
                    contVetorCC = deletarContaCorrente
                    (nome_conta, contVetorCC, vetorCC);
                    break;
                case 10:
                    break;
                case 11:
                    JOptionPane.showMessageDialog
                    (null, "Encerrando....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Opção Inválida!\n"
                            + "Tente novamente");
            }
        } while (opcao!=11);
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
    
    public static int deletarContaCorrente
        (String nome, int cont, Corrente[] cc) {
        int pos_conta = -1;
        for (int i = 0; i < cont; i++) {
            if (nome.equals(cc[i].getPessoa().getNome())){
                pos_conta = i;
            }
        }
                    
        if (pos_conta!=-1){
            int resposta = JOptionPane.showConfirmDialog(null, 
                "Você tem certeza?");
            if (resposta == 0){
                cc[pos_conta] = cc[cont-1];
                cc[cont-1] = null;
                cont--;
                JOptionPane.showMessageDialog
                (null, "Conta deletada com sucesso!");
            } else {
                JOptionPane.showMessageDialog
                    (null, "Conta não deletada!");
                }
        } else {
            JOptionPane.showMessageDialog
            (null, "Conta não encontrada!");
        }
        return cont;
    }

}
