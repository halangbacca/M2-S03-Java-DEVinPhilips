public class Clinica {
    String nomeDoDono;
    String nomeDaClinica;
    String CNPJ;
    String logradouro;
    int numeroDaClinica;

    public void calcularIMC(Double peso, Double altura) {
        Double IMC = peso / (altura * altura);
        if (IMC < 18.5) {
            System.out.println(String.format("%.2f = Magreza", IMC));
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println(String.format("%.2f = Normal", IMC));
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println(String.format("%.2f = Sobrepeso", IMC));
        } else if (IMC >= 30.0 && IMC <= 39.9) {
            System.out.println(String.format("%.2f = Obesidade", IMC));
        } else if (IMC > 40.0) {
            System.out.println(String.format("%.2f = Obesidade grave", IMC));
        }

    }
}
