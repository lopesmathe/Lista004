package br.edu.up.controle;
import  br.edu.up.modelos.Biblioteca;
public class Livros {
    private Biblioteca[] bisbisosteca; 
        public Livros(){
            this.bisbisosteca = new Biblioteca[2];

            Biblioteca livro1 = new Biblioteca();
            livro1.setCodigo("1598FHK");
            livro1.setTitulo("Core Java 2");
            livro1.setAutores( new String[]{"Cay S. Horstmann", "Gary Cornell"});
            livro1.setIsbn(10130819336L);
            livro1.setAno(2005);
            
            Biblioteca livro2 = new Biblioteca();
            livro2.setCodigo("9865PLO");
            livro2.setTitulo("Java, Como programar");
            livro2.setAutores( new String[]{"Harvey Deitel"});
            livro2.setIsbn(0130341517L);
            livro2.setAno(2015);

            this.bisbisosteca[0] = livro1;
            this.bisbisosteca[1] = livro2;
        }

        public Biblioteca[] getBisbisosteca() {
            return bisbisosteca;
        }

        public void setBisbisosteca(Biblioteca[] bisbisosteca) {
            this.bisbisosteca = bisbisosteca;
        }

        
}
