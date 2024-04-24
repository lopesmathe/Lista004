package br.edu.up.controles;
import java.util.Scanner;
import br.edu.up.modelos.Livro;
import br.edu.up.telas.Menu;;
public class ControleEstande {
    private Livro[] livro;

    public void insert(){
        this.livro = new Livro[5];
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("as");
            if (livro[i] == null) {
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

                livro[i] = new Livro(codigo, titulo, autores, isbn, ano);
                menu.run();
            }
            else
            System.out.println("a");
        }

    }
    public Livro[] getLivro() {
        return livro;
    }

    public void setLivro(Livro[] livro) {
        this.livro = livro;
    }
    

}
