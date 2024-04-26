public class Filme {
    
    private String nome;
    private String genero;

    public Filme(){

    }

    public Filme(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString(){

        return "Filme em cartaz: " + nome + "\n Gênero: " + genero;
    }


}


