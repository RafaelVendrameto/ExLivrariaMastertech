package SistemaLivraria;

public class Editora {
    private String nome;
    private String ano;
    private String cnpj;
    private String enderecoRua;
    private String enderecoNumero;
    private String pais;
    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Editora(String nome, String ano, String cnpj, String enderecoRua, String enderecoNumero, String pais, String estado) {
        this.nome = nome;
        this.ano = ano;
        this.cnpj = cnpj;
        this.enderecoRua = enderecoRua;
        this.enderecoNumero = enderecoNumero;
        this.pais = pais;
        this.estado = estado;
    }

    public String listarDados() {
        return "Editora{" +
                "Nome = '" + nome + '\'' +
                ", Ano = '" + ano + '\'' +
                ", Cnpj = '" + cnpj + '\'' +
                ", Endereço Rua = '" + enderecoRua + '\'' +
                ", " + enderecoNumero + '\'' +
                ", Pais = '" + pais + '\'' +
                ", Estado = '" + estado + '\'' +
                '}';
    }
}
