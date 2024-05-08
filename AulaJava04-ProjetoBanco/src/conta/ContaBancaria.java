package conta;

import cliente.Pessoa;

public class ContaBancaria {
    private String nroConta, agencia, senha;
    private float saldo;
    private Pessoa p;

    public String getNroConta() {
        return nroConta;
    }

    public void setNroConta(String nroConta) {
        this.nroConta = nroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }
    
    
    
}
