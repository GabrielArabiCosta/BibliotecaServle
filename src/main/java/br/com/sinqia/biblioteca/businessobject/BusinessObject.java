package br.com.sinqia.biblioteca.businessobject;

import br.com.sinqia.biblioteca.dao.LivroDAO;
import br.com.sinqia.biblioteca.model.Livro;

import java.util.List;
import java.util.Objects;

public class BusinessObject implements BOImpl{

    private LivroDAO livroDAO;


    @Override
    public Livro save(Livro livro) {
        valida(livro);
        return livroDAO.save(livro);
    }

    private void valida(Livro livro) {
        if(Objects.isNull(livro.getNome())){
            throw new IllegalArgumentException("Um Livro não pode ser salvo sem um nome");
        }
    }

    @Override
    public List<Livro> findAll() {
        return livroDAO.findAll();
    }
}
