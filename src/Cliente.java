public class Cliente {
    private Float peso;
    private Float altura;
    private Integer idade;

    public Cliente(Float altura, Float peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public Cliente(Float altura, Float peso, Integer idade) {
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
    }


}