package br.edu.up.controle;

import br.edu.up.modelos.Livro;

public class ControleBiblioteca {

    private Livro[] livros;

    public ControleBiblioteca() {
        this.livros = new Livro[2];

        Livro livro1 = new Livro();
        livro1.setCodigo("1598FHK");
        livro1.setTitulo("Core Java 2");
        livro1.setAutores(new String[] { "Cay S. Horstmann", "Gary Cornell" });
        livro1.setIsbn(10130819336L);
        livro1.setAno(2005);

        Livro livro2 = new Livro();
        livro2.setCodigo("9865PLO");
        livro2.setTitulo("Java, Como programar");
        livro2.setAutores(new String[] { "Harvey Deitel" });
        livro2.setIsbn(0130341517L);
        livro2.setAno(2015);

        this.livros[0] = livro1;
        this.livros[1] = livro2;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

}
