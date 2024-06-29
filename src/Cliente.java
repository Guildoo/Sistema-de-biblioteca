import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int id;
    private List<Livro> livrosEmprestados;

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void emprestarLivro(Livro livro) {
        if (livro != null && livro.isDisponivel()) {
            livro.emprestar();
            livrosEmprestados.add(livro);
        } else {
            System.out.println("Livro não está disponível.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            livro.devolver();
        } else {
            System.out.println("Livro não está com o cliente.");
        }
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", id=" + id + ", livrosEmprestados=" + livrosEmprestados + "]";
    }
}
