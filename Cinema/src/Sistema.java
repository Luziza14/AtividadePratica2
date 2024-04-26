public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nFUNCIONARIO SYSTEM");
        System.out.println("1) Registrar Filme no Catálogo");
        System.out.println("2) Gerar Ingresso");
        System.out.println("3) Listar Filmes Cadastrados");
        System.out.println("4) Buscar Filme");
        System.out.println("5) Excluir Filme catalogado");
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
        int data;
        int hora;

        switch (op) {
            case 1:

                System.out.println("\nAdicione o nome do Filme:");
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

                System.out.println("\nEscolha o filme ");
                System.out.print("Nome do filme: ");
                nome = Console.lerString();

                System.out.print("Digite o número da Sala");
                idSala = Console.lerInt();

                System.out.print("Diga a hora");
                hora = Console.lerInt();

                Cliente c = new Cliente(idSala, nome, hora);

                Cadastro.cadastrar(g);

                System.out.println("\nGerente cadastrado com sucesso!");

                break;

            case 3:

                System.out.println("\nProcurar Funciomário:");

                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                // enviar a matricula digitada como parametro para o
                // metodo buscar da classe Cadastro.
                // Este método retornará ou um objeto do tipo Funcinario,
                // ou null, se não encontrar funcionario com a mesma matricula informada
                Funcionario f = Cadastro.buscar(matricula);

                if (f != null) {

                    System.out.println("\nFuncionário Localizado:");
                    System.out.println(f.toString());
                    return;

                }

                System.out.println("\nFuncionário " + matricula + " não foi encontrado");

                break;

            case 4:

                System.out.println("\nTodos os funcionários Cadastrados:");

                // Se o tamanho da lista for igual a 0 (zero)
                if (Cadastro.getListaFuncionarios().size() == 0) {

                    System.out.println("\nNão há fucionários cadastrados...");
                    return; // finaliza o método

                }

                // caso contrário, percorre a lista e msotra os funcionarios um a um
                for (Funcionario temp : Cadastro.getListaFuncionarios()) {

                    System.out.println(temp.toString());

                }

                break;

            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
