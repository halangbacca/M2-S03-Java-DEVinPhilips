public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        Cliente cliente = new Cliente();

        clinica.calcularIMC(58.0F, 1.50F);
        clinica.adicionarCliente(cliente);

    }
}