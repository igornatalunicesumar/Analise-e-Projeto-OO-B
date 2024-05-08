package banco;

public class Conta {
    private String nome, nConta, senha;
    private int nContaautomatica = 1000;
    private float saldo;

    public Conta(String nome, String senha, float saldo) {
        this.nome = nome;
        this.nConta = nContaautomatica+"";
        this.senha = senha;
        this.saldo = saldo;
        nContaautomatica++;
    }
    
    public String getNConta(){
        return this.nConta;
    }

    
    
    
    
}
