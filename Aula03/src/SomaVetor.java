public class SomaVetor {
    public float somaNumeros(float[] vetor, int tamanho){
        float somatoria = 0;
        for (int i = 0; i < tamanho; i++) {
            somatoria += vetor[i];
        }
        
        return somatoria;
    }
}
