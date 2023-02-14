import java.util.ArrayList;
import java.util.List;

public class Clinica {
    String nomeDoDono;
    String nomeDaClinica;
    String CNPJ;
    String logradouro;
    Integer numeroDaClinica;
    List listaDeCLientes = new ArrayList<Cliente>();

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
}
