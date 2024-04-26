import java.util.ArrayList;
import java.util.List;

public class Cadastro {

private static List<Filme> listaSessao = new ArrayList<>();

public static void cadastrar (Filme filme){
    
    listaSessao.add(filme);
}

public static List<Filme> getlistaSessao(){

    return listaSessao;
}

public static Filme buscar(String nome){

    for(Filme fil : listaSessao){

        if (fil.getNome().equals(nome)){

            return fil;
        }
        
    }

    return null;
}

    public static void excluir(Filme f3) {

        
        listaSessao.remove(f3);
    }


public static void excluirLista()
    {
        

        listaSessao.clear();

    }






}


