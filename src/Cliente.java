public class Cliente {
    private Float peso;
    private Float altura;
    private Integer idade;

    // Construtores
    public Cliente(Float altura, Float peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public Cliente(Float altura, Float peso, Integer idade) {
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
    }

    // Getters e Setters
    public Float getPeso() {
        return peso;
    }

    public Float setPeso(Float peso) {
        this.peso = peso;
        return peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}