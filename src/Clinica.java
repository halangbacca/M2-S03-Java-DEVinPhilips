import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nomeDoDono;
    private String nomeDaClinica;
    private String CNPJ;
    private String logradouro;
    private Integer numeroDaClinica;
    private List listaDeCLientes = new ArrayList<Cliente>();

    public void calcularIMC(Float peso, Float altura) {
        Float IMC = peso / (altura * altura);
        if (IMC < 18.5F) {
            System.out.println(String.format("%.2f = Magreza", IMC));
        } else if (IMC >= 18.5F && IMC <= 24.9F) {
            System.out.println(String.format("%.2f = Normal", IMC));
        } else if (IMC >= 25.0F && IMC <= 29.9F) {
            System.out.println(String.format("%.2f = Sobrepeso", IMC));
        } else if (IMC >= 30.0F && IMC <= 39.9F) {
            System.out.println(String.format("%.2f = Obesidade", IMC));
        } else if (IMC > 40.0F) {
            System.out.println(String.format("%.2f = Obesidade grave", IMC));
        }
    }

    public void adicionarCliente(Cliente cliente) {
        listaDeCLientes.add(cliente);
    }
}
