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

        if (fil.getNome() == nome){

            return fil;
        }
        
    }

    return null;
}


public static void removerFilme(Filme filme) {
    if (listaSessao.contains(filme)) {
      listaSessao.remove(filme);
    } else {
      System.out.println("Filme não encontrado na lista.");
    }
  }


public static void ExcluirLista()
    {

        listaSessao.clear();

    }

public static void excluir(Filme f) {
        listaSessao.remove(f);
    }






}
