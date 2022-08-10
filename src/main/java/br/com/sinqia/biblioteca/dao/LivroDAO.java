package br.com.sinqia.biblioteca.dao;

import br.com.sinqia.biblioteca.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroDAO implements DAOI {

    private static final List<Livro> listaDeLivros = new ArrayList<>();

    @Override
    public Livro save(Livro livro) {
        listaDeLivros.add(livro);
        return livro;
    }


    @Override
    public List<Livro> findAll() {return listaDeLivros;}
}