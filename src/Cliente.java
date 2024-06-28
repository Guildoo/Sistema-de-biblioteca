public class Cliente {
    private String nome;
    private Integer id;
    private List<Livro> livrosEmprestados;

    public Cliente(String nome, Integer id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {
        if (livro != null && livro.disponivel) {
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
            System.out.println("Livro não está com cliente.");
        }
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", id=" + id + ", livrosEmprestados=" + livrosEmprestados + "]";
    }
}
