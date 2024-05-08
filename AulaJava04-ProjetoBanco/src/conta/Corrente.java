package conta;

public class Corrente extends ContaBancaria {
    private boolean cartaoCredito;

    public boolean isCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(boolean cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }
}
