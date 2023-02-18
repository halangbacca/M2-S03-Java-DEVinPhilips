import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nomeDoDono;
    private String nomeDaClinica;
    private String CNPJ;
    private String logradouro;
    private Integer codigoDaClinica;
    private List<Cliente> listaDeClientes = new ArrayList<>();

    // Construtores
    public Clinica(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public Clinica(String nomeDoDono, List<Cliente> listaDeClientes) {
        this.nomeDoDono = nomeDoDono;
        this.listaDeClientes = listaDeClientes;
    }

    // Métodos
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
        listaDeClientes.add(cliente);
    }

    public Float tratamento(Integer id) {
        if (listaDeClientes.size() < id - 1) {
            System.out.println("Cliente não identificado!");
        } else {
            listaDeClientes.get(id).setPeso(listaDeClientes.get(id).getPeso() - 5);
        }
        return listaDeClientes.get(id).getPeso();
    }

    public Float tratamento(Integer id, Float valor) {
        if (listaDeClientes.size() < id) {
            System.out.println("Cliente não identificado!");
        } else {
            listaDeClientes.get(id).setPeso(listaDeClientes.get(id).getPeso() - valor);
        }
        return listaDeClientes.get(id).getPeso();
    }

    // Getters e Setters
    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public String getNomeDaClinica() {
        return nomeDaClinica;
    }

    public void setNomeDaClinica(String nomeDaClinica) {
        this.nomeDaClinica = nomeDaClinica;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getCodigoDaClinica() {
        return codigoDaClinica;
    }

    public void setCodigoDaClinica(Integer codigoDaClinica) {
        this.codigoDaClinica = codigoDaClinica;
    }

    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }
}
