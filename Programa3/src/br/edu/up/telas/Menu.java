package br.edu.up.telas;

import br.edu.up.controles.ControleEstande;
import br.edu.up.modelos.Livro;
import java.util.Scanner;

public class Menu {

    ControleEstande control = new ControleEstande();
    Livro[] livros = new Livro[5];

    // Método para executar o menu da estante de livros
    public void run() {
        // Mensagem inicial
        while (true) {

            System.out.println("Em uma estante de livros tem 5 modulares");
            System.out.println("-------------------------------------------");
            System.out.println("| 1. Push = inserir livro                 |");
            System.out.println("| 2. Pop = remover livro                  |");
            System.out.println("| 3. Peek = visualizar livro               |");
            System.out.println("| 4. Listar = listar todos os livros      |");
            System.out.println("| 5. Sair                                 |");
            System.out.println("-------------------------------------------");

            // Instanciação do controle da estante e do scanner

            Scanner scanner = new Scanner(System.in);

            // Leitura da escolha do usuário
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    colocarLivros();
                    break;
                case 2:
                    // Comentário 1: Adicione aqui a lógica para remover um livro da estante
                    break;
                case 3:
                    // Comentário 2: Adicione aqui a lógica para visualizar um livro da estante sem
                    // removê-lo
                    break;
                case 4:
                    // Listar todos os livros da estante
                    Livro[] livros = control.getLivros();

                    for (int i = 0; i < 5; i++) {
                        if (livros[i] != null) {
                            String srt = " Título: " + livros[i].getTitulo() + " Autores: " + livros[i].getAutores()
                                    + " Ano: " + livros[i].getAno() + " Código: " + livros[i].getCodigo() + " ISBN: "
                                    + livros[i].getIsbn();
                            System.out.println(srt);
                        } else
                            System.out.println("livro na posiçao " + i + " esta vazio");
                    }
                    break;
                case 5:
                    // Sair do menu
                    break;
                default:
                    break;
            }
        }
    }

    public void colocarLivros() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("as");
            if (livros[i] == null) {
                System.out.println("me diga qual é o titulo do livro");
                String titulo = scanner.nextLine();

                System.out.println("autores: ");
                String autores = scanner.nextLine();

                System.out.println("codigo: ");
                String codigo = scanner.nextLine();

                System.out.println("ano: ");
                int ano = scanner.nextInt();
                scanner.nextLine();

                System.out.println("isbn: ");
                String isbn = scanner.nextLine();

                livros[i] = new Livro(codigo, titulo, autores, isbn, ano);
                System.out.println("Livro inserido:");
                System.out.println(livros[i].getAno());

                break;
            } 
        }
        control.setLivros(livros);
    }
}
