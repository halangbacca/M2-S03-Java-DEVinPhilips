import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> listaDeClientes = new ArrayList<Cliente>();
        Cliente cliente = new Cliente(1.75F, 55.0F);
        Clinica clinica = new Clinica("Halan", listaDeClientes);

        clinica.calcularIMC(58.0F, 1.50F);
        clinica.adicionarCliente(cliente);

    }
}