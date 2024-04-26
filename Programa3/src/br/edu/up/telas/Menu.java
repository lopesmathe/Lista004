package br.edu.up.telas;

import br.edu.up.controles.ControleEstande;
import br.edu.up.modelos.Livro;
import java.util.Scanner;

public class Menu {
    // Método para executar o menu da estante de livros
    public void run (){
        // Mensagem inicial
        System.out.println("Em uma estante de livros tem 5 modulares");
        System.out.println("-------------------------------------------");
        System.out.println("| 1. Push = inserir livro                 |");
        System.out.println("| 2. Pop = remover livro                  |");
        System.out.println("| 3. Peek = visualizar livro               |");
        System.out.println("| 4. Listar = listar todos os livros      |");
        System.out.println("| 5. Sair                                 |");
        System.out.println("-------------------------------------------");

        // Instanciação do controle da estante e do scanner
        ControleEstande control = new ControleEstande();
        Scanner scanner = new Scanner(System.in);

        // Leitura da escolha do usuário
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                control.insert();
                break;
            case 2:
                // Comentário 1: Adicione aqui a lógica para remover um livro da estante
                break;
            case 3:
                // Comentário 2: Adicione aqui a lógica para visualizar um livro da estante sem removê-lo
                break;
            case 4:
                // Listar todos os livros da estante
                Livro[] books = control.getLivro();
                for (int i = 0; i < 5; i++) {
                    Livro bi = books[i];
                    String srt = " Título: " + bi.getTitulo() + " Autores: " + bi.getAutores() + " Ano: " + bi.getAno() + " Código: " + bi.getCodigo() + " ISBN: " + bi.getIsbn();
                    System.out.println(srt);
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
