package br.com.sinqia.biblioteca.model;

public class Livro {

    private String autor;
    private String nome;

    public Livro(String autor, String nome) {
        this.autor = autor;
        this.nome = nome;
    }

    public String getAutor() { return autor; }
    public String getNome() { return nome; }

    public void setAutor(String autor) { this.autor = autor; }
    public void setNome(String nome) { this.nome = nome; }

    public Livro() {
    }


}

