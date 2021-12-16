package Tarefa1Biblioteca;

import java.util.Scanner;

public class Tarefa1Biblioteca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Livro li = new Livro("Dom Casmurro", "12345678910", 500); // instanciando a classe
        Livro li2 = new Livro("O Mistérios dos 5 Estrelas", "111213141234", 250); // instanciando a classe
        Livro li3 = new Livro("Turma da Monica", "203912948", 72); // instanciando a classe
        Livro li4 = new Livro(); // instanciando a classe

        li.exibirDados();
        li2.exibirDados();
        li3.exibirDados();
        li4.exibirDados();

        if (li.getQuantidadePaginas() > li2.getQuantidadePaginas()
                && li.getQuantidadePaginas() > li3.getQuantidadePaginas()) {
            System.out.println("Livro com maior quantidade de paginas:");
            li.exibirDados();
        } else if (li2.getQuantidadePaginas() > li.getQuantidadePaginas()
                && li2.getQuantidadePaginas() > li3.getQuantidadePaginas()) {
            System.out.println("Livro com maior quantidade de paginas:");
            li2.exibirDados();
        } else if (li3.getQuantidadePaginas() > li.getQuantidadePaginas()
                && li3.getQuantidadePaginas() > li2.getQuantidadePaginas()) {
            System.out.println("Livro com maior quantidade de paginas:");
            li3.exibirDados();
        }
        if (li.getQuantidadePaginas() < li2.getQuantidadePaginas()
                && li.getQuantidadePaginas() < li3.getQuantidadePaginas()) {
            System.out.println("Livro com menor quantidade de paginas:");
            li.exibirDados();
        } else if (li2.getQuantidadePaginas() < li.getQuantidadePaginas()
                && li2.getQuantidadePaginas() < li3.getQuantidadePaginas()) {
            System.out.println("Livro com menor quantidade de paginas:");
            li2.exibirDados();
        } else if (li3.getQuantidadePaginas() < li.getQuantidadePaginas()
                && li3.getQuantidadePaginas() < li2.getQuantidadePaginas()) {
            System.out.println("Livro com menor quantidade de paginas:");
            li3.exibirDados();
        }

    }

}
