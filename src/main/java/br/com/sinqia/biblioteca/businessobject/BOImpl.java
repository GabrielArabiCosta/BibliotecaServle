package br.com.sinqia.biblioteca.businessobject;

import br.com.sinqia.biblioteca.model.Livro;

import java.util.List;

public interface BOImpl {


    Livro save(Livro livro);

    List<Livro> findAll();

}
