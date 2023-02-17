public class Main {
    public static void main(String[] args) {

        Clinica clinica = new Clinica("Halan");

        clinica.adicionarCliente(new Cliente(175F, 55F));

        System.out.println(clinica.tratamento(0));

    }
}