import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cadastrar Material");
            System.out.println("2. Listar Materiais");
            System.out.println("3. Visualizar Material");
            System.out.println("4. Excluir Material");
            System.out.println("5. Editar Material");
            System.out.println("6. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("1. Livro");
                    System.out.println("2. Revista");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Título:");
                    String titulo = scanner.nextLine();

                    if (tipo == 1) {
                        System.out.println("Autor:");
                        String autor = scanner.nextLine();
                        biblioteca.adicionarMaterial(new Livro(titulo, autor));
                    } else if (tipo == 2) {
                        System.out.println("Edição:");
                        int edicao = scanner.nextInt();
                        scanner.nextLine();
                        biblioteca.adicionarMaterial(new Revista(titulo, edicao));
                    }
                    break;

                case 2:
                    biblioteca.listarMateriais();
                    break;

                case 3:
                    System.out.println("ID do material:");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    Material material = biblioteca.visualizarMaterial(id);
                    if (material != null) {
                        material.exibirDetalhes();
                    } else {
                        System.out.println("Material não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("ID do material:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.excluirMaterial(id);
                    break;

                case 5:
                    System.out.println("ID do material:");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Novo Título:");
                    String novoTitulo = scanner.nextLine();
                    biblioteca.editarMaterial(id, novoTitulo);
                    break;

                case 6:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
