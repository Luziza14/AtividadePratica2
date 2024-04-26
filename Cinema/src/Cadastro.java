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

        if (temp.getNome() == nome){

            return fil;
        }
        
    }

    return null;
}
}
