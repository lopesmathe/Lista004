package br.edu.up.tela;

import br.edu.up.controle.Livros;
import br.edu.up.modelos.Biblioteca;
import java.util.Scanner;

public class Menu {
    public void run() {
        Livros livros = new Livros();
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
        Livros livross = new Livros(); // tt
        switch (escolha) {
            case 1:
                Biblioteca[] book = livross.getBisbisosteca();
                System.out.println("Livros");
                System.out.println(colorBlue);
                for (int i = 0; i < book.length; i++) {
                    Biblioteca bi = book[i];
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
