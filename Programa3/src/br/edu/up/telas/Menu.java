package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.controles.ControleEstande;
import br.edu.up.modelos.Livro;;
public class Menu {
    public void run (){
        System.out.println("em uma estande de livros tem 5 modulares");
        System.out.println("-------------------------------------------");
        System.out.println("| 1. Push = inserir livro                 |");
        System.out.println("| 2. Pop = remover livro                  |");
        System.out.println("| 3.  Peek = visualizar livro             |");
        System.out.println("| 4. Listar = listar todos os livros      |");
        System.out.println("| 5. Sair                                 |");
        System.out.println("-------------------------------------------");
        ControleEstande control = new ControleEstande();
        Scanner scanner = new Scanner(System.in);
        ControleEstande controle = new ControleEstande();
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                control.insert();
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
            Livro[] books = control.getLivro();
                for (int i = 0; i < 5; i++) {
                    Livro bi = books[i];
                    String srt = " Titulo : " + bi.getTitulo() + " autores : " + bi.getAutores() + " Ano: " + bi.getAno() + " Codigo " + bi.getCodigo() + "isbn: " + bi.getIsbn();
                    System.out.println(srt);
                }
                break;
            case 5:
                break;
            default:
                break;
        }
    }
}
