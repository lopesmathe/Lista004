package br.edu.up.controle;

import br.edu.up.modelos.Livro;

public class ControleBiblioteca {

    private Livro[] livros;

    public ControleBiblioteca() {
        // Inicialização do array de livros com tamanho 2
        this.livros = new Livro[2];

        // Inicialização do primeiro livro
        Livro livro1 = new Livro();
        livro1.setCodigo("1598FHK");
        livro1.setTitulo("Core Java 2");
        livro1.setAutores(new String[] { "Cay S. Horstmann", "Gary Cornell" });
        livro1.setIsbn(10130819336L);
        livro1.setAno(2005);

        // Inicialização do segundo livro
        Livro livro2 = new Livro();
        livro2.setCodigo("9865PLO");
        livro2.setTitulo("Java, Como programar");
        livro2.setAutores(new String[] { "Harvey Deitel" });
        livro2.setIsbn(0130341517L);
        livro2.setAno(2015);

        // Atribuição dos livros ao array
        this.livros[0] = livro1;
        this.livros[1] = livro2;
    }

    // Método para obter os livros
    public Livro[] getLivros() {
        return livros;
    }

    // Método para definir os livros
    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    
}
