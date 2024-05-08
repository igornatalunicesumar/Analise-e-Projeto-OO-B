package conta;

public class Poupanca extends ContaBancaria {
    private float taxa;

    public float getTaxa() {
        return taxa;
    }

    public Poupanca() {
        this.taxa = 0.1f;
    }
    
    
}
