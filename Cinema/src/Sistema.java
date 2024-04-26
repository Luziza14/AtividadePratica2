public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nFUNCIONARIO SYSTEM");
        System.out.println("1) Registrar Filme no Catalogo");
        System.out.println("2) Gerar Ingresso");
        System.out.println("3) Listar Filmes Cadastrados");
        System.out.println("4) Buscar Filme");
        System.out.println("5) Excluir um filme no catalago");
        System.out.println("6) Exclusao Total");
        System.out.println("0) Sair");
        System.out.print("Selecione uma das opcões: ");

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

                Filme f = new Filme(nome, genero);
               

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

                System.out.println("Diga o gênero do filme");
                genero = Console.lerString();
                
                System.out.print("Digite o id do filme");
                id = Console.lerInt();                
                
                System.out.print("Diga a data");
                data = Console.lerString();

               Cliente c = new Cliente(nome, genero, id, data, idSala, hora, nomeCliente);

                Cadastro.cadastrar(c);

                System.out.println("\nBilhete gerado com sucesso :) ");
                System.out.println("\nNome: " + nomeCliente + "\nFilme escolhido " + nome + "\nGenero do Filme " + genero + "\nData: " + data + "Hora: " + hora + "\nSala de Exibição " + idSala );
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
                nome = Console.lerString();

                
                Filme f2 = Cadastro.buscar(nome);

                if (f2 != null) {

                System.out.println("\nFilme encontrado:");
                System.out.println(f2.toString());
                return;
                }

                break;
                
            case 5:

                System.out.print("\nInforme um filme que deseja excluir: ");
                nome = Console.lerString();
    
                Filme f3 = Cadastro.buscar(nome);

               
        
                if (f3 == null) {
                    System.out.println("\nFilme " + nome + " não existe");
                    return;
                }
        
                Cadastro.excluir(f3);
        
                System.out.println("\nFilme removido de cartaz");
                
                 break;

            case 6:

            Cadastro.excluirLista();
            System.out.println("Exclusão total de registro ");
        

                break;

                
            case 0:

                System.out.println("\nO programa foi finalizado");
                break;

            default:

                System.out.println("\nOpção inválida");
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




