public class Cliente extends Sala{

    private String nomeCliente;


    public Cliente() {
    }
        
    public Cliente(String nome, String genero, int id, int data, int idSala, int hora, String nomeCliente) {
        super(nome, genero, id, data, idSala, hora);
        this.nomeCliente = nomeCliente;
    }
    
        

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nCliente: " + nomeCliente;
    }

        
}

