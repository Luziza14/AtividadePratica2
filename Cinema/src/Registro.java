public class Registro extends Filme {

    int id;
    

    
        public Registro() {
        }
    
        public Registro(String nome, String genero, int id) {
            super(nome, genero);
            this.id = id;
        }
    

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
    
            return super.toString() +
                    "\nNome do projeto: " + id;
        }
    
    }

