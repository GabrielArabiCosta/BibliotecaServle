package br.com.sinqia.biblioteca;

import br.com.sinqia.biblioteca.model.Livro;
import br.com.sinqia.biblioteca.businessobject.BusinessObject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class LivroServlet extends HttpServlet {

    private BusinessObject livroBO;



    @Override
    public void init() throws ServletException { System.out.println("Iniciando Servlet"); }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Chamando o Metodo");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        String autor = req.getParameter("autor");
        String nome = req.getParameter("nome");


        Livro livro = new Livro(autor, nome);
        Livro livroSalvo = livroBO.save(livro);
        List<Livro> livros = livroBO.findAll();


        RequestDispatcher dispatcher = req.getRequestDispatcher("lista-livros.jsp");
        dispatcher.forward(req,resp);
    }



    @Override
    public void destroy() {
        System.out.println("Destruindo Servlet");
    }
}
