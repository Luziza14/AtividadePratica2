public class Cliente extends Sala{

    

        String nomeCliente;
        
    
        
            public Cliente() {
            }
        
            public Cliente (String nomeCliente, String nome, int id, int idSala) {
                super(nome,id,idSala);
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
        
                return super.toString() +
                        "\nNome do projeto: " + nomeCliente;
            }

        
        }
