public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private Boolean disponivel;

    public Livro(String titulo, String autor, String isbn, Boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel){
            disponivel = false;
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }

    public void devolver() {
        disponivel = true;
    }

    @Override
    public String toString() {
        return "Livro [título=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", disponivel=" + disponivel + "]";
    }
}
