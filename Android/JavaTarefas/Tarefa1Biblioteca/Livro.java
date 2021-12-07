package Tarefa1Biblioteca;

public class Livro {
    protected String titulo;
    protected String ISBN;
    protected int quantidadePaginas;

    public Livro(String titulo, String ISBN, int quantidadePaginas) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.quantidadePaginas = quantidadePaginas;
    }

    public Livro() {
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void exibirDados() {
        System.out.println("Titulo: " + titulo + " ISBN: " + ISBN + " quantidade de paginas: " + quantidadePaginas);
    }

}
