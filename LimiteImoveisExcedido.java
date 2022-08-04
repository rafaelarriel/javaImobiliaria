public class LimiteImoveisExcedido extends RuntimeException {
    private String nome;
    public LimiteImoveisExcedido(String nome) {
        super("Imobiliaria " + nome + " atingiu o número máximo de imóveis!");
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    
    
}
