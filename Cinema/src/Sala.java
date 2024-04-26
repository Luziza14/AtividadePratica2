public class Sala extends Registro{

    private String data;
    private int idSala;
    private int hora;
    
    public Sala() {

    }
    public Sala(String nome, String genero, int id, String data, int idSala, int hora) {
        super(nome, genero, id);
        this.data = data;
        this.idSala = idSala;
        this.hora = hora;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getIdSala() {
        return idSala;
    }
    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }


    @Override
    public String toString() {
        
        return super.toString() + "A sala de exibição do Filme é a Sala " +idSala;
    }


    
}

