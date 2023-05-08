package Classes;

public class Categoria {

    private static int id = 1020;
    private String nome;
    private int identificador;

    public Categoria(String nome) {
        identificador = id;
        this.nome = nome;
        id++;
    }

    public Categoria(int identificador, String nome) {
        this.identificador = identificador;
        this.nome = nome;
        id++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "Categoria [nome=" + nome + ", identificador=" + identificador + "]" + "\n";
    }

}

