public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nFUNCIONARIO SYSTEM");
        System.out.println("1) Registrar Filme no Catálogo");
        System.out.println("2) Gerar Ingresso");
        System.out.println("3) Listar Filmes Cadastrados");
        System.out.println("4) Buscar Filme");
        System.out.println("5) Excluir um filme no catálago");
        System.out.println("6) Exclusão Total");
        System.out.println("0) Sair");
        System.out.print("Selecione uma das opções: ");

    }

    private static void verificarOpcao(int op) {

        String nome;
        String genero;
        String nomeCliente;
        int id;
        int idSala;
        String data;
        String hora;

        switch (op) {
            case 1:

                System.out.println("\nADICIONE UM FILME");
                System.out.print("Filme: ");
                nome = Console.lerString();

                System.out.println("\nAdicione o gênero do Filme:");
                System.out.print("Gênero: ");
                genero = Console.lerString();

                Filme f = new Filme(genero, nome);

                Cadastro.cadastrar(f);

                System.out.println("Filme cadastrado");

                break;

            case 2:

                System.out.println("\nESCOLHA O FILME");

                System.out.println("Informe seu nome");
                nomeCliente = Console.lerString();


                System.out.print("Informe o nome do filme escolhido: ");
                nome = Console.lerString();


                System.out.print("\nDigite o número da Sala:");
                idSala = Console.lerInt();


                System.out.print("Diga a hora");
                hora = Console.lerString();

                

               Cliente c = new Cliente(nome, genero, id, data, idSala, hora, nomeCliente);

                Cadastro.cadastrar(c);

                System.out.println("\nFilme selecionado com Sucesso");

                break;

            case 3:

                System.out.println("\nListar Filmes Cadastrados");

                if (Cadastro.getlistaSessao().size() == 0) {

                    System.out.println("\nSem filmes em cartaz");
                    return; 

                }

                for (Filme fil : Cadastro.getlistaSessao()) {

                    System.out.println(fil.toString());

                }

                break;

            case 4:

                System.out.println("\nBuscar Filme:");

                System.out.print("Nome do Filme: ");
                id = Console.lerInt();

                
                Filme r = Cadastro.buscar(nome);

                if (r != null) {

                System.out.println("\nFilme encontrado:");
                System.out.println(r.toString());
                return;

}

                break;
                
            case 5:

                System.out.print("\nInforme a matricula do func. que deseja excluir: ");
                int matricula = Console.lerInt();
        
                Funcionario f2 = Cadastro.buscar(matricula);
        
                if (f2 == null) {
                    System.out.println("\nFuncionário " + matricula + " não foi encontrado");
                    return;
                }
        
                Cadastro.excluir(f2);
        
                System.out.println("\nFuncionário excluído com sucesso!");

                break;

            case 6:

            Cadastro.excluirLista();
        

                break;

                
            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

    }
}




