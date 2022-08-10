package br.com.sinqia.biblioteca.dao;

import br.com.sinqia.biblioteca.model.Livro;

import java.util.List;

public interface DAOI {

     Livro save(Livro livro);


     List<Livro> findAll ();

}
