package Classes;

public class Cliente {

    private String nome;
    private long telefone;
    private long cnh;
    private long cpf;

    public Cliente(String nome, long telefone, long cnh, long cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cnh = cnh;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getCnh() {
        return cnh;
    }

    public void setCnh(long cnh) {
        this.cnh = cnh;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", telefone=" + telefone + ", cnh=" + cnh + ", cpf=" + cpf + "]" + "\n";
    }

}
