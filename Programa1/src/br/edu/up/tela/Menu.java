package br.edu.up.tela;

import br.edu.up.controle.ControleBiblioteca;
import br.edu.up.modelos.Livro;
import java.util.Scanner;

public class Menu {
    public void run() {
        ControleBiblioteca livros = new ControleBiblioteca();
        String colorBlack = "\033[30m--------------------------------------------------------------------------------------------------\033[0m";
        String colorRed = "\033[31m--------------------------------------------------------------------------------------------------\033[0m";
        String colorGreen = "\033[32m--------------------------------------------------------------------------------------------------\033[0m";
        String colorYellow = "\033[33m--------------------------------------------------------------------------------------------------\033[0m";
        String colorBlue = "\033[34m--------------------------------------------------------------------------------------------------\033[0m";
        String colorMagenta = "\033[35m--------------------------------------------------------------------------------------------------\033[0m";
        String colorCyan = "\033[36m--------------------------------------------------------------------------------------------------\033[0m";
        String colorWhite = "\033[37m--------------------------------------------------------------------------------------------------\033[0m";

        System.out.println(colorBlue);
        System.out.println(colorRed);
        System.out.println(colorYellow);
        System.out.println(colorCyan);
        System.out.println(colorMagenta);
        System.out.println(colorWhite);
        System.out.println(colorGreen);
        System.out.println(colorBlack);

        Scanner scanner = new Scanner(System.in);
        System.out.println("me diga qual livro vc vai querer ver");
        System.out.println("digite 1 para ver todos os livros");

        int escolha = scanner.nextInt();
        ControleBiblioteca controle = new ControleBiblioteca(); // tt
        switch (escolha) {
            case 1:
                Livro[] books = controle.getLivros();
                System.out.println("Livros");
                System.out.println(colorBlue);
                for (int i = 0; i < books.length; i++) {
                    Livro bi = books[i]; // tt
                    String srt = " Titulo : " + bi.getTitulo() + " Ano: " + bi.getAno() + " Codigo " + bi.getCodigo()
                            + "  Isbn" + bi.getIsbn();
                    System.out.println(srt);
                    System.out.println(colorBlue);
                }
                break;
            default:
                break;
        }
    }
}
