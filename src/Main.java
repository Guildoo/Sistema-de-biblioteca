public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        Livro livro1 = new Livro("Entendendo Algoritmos", "Aditya Bhargava", "978-8575225639");
        Livro livro2 = new Livro("Java para Inciantes", "Herbert Schildt", "978-8582603369");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Adicionando clientes
        Cliente cliente1 = new Cliente("Pedro", 1);
        Cliente cliente2 = new Cliente("Eduarda", 2);

        biblioteca.adicionarCliente(cliente1);
        biblioteca.adicionarCliente(cliente2);

        // Emprestando e devolvendo livros
        cliente1.emprestarLivro(livro1);
        cliente1.devolverLivro(livro1);

        // Listando livros e clientes
        biblioteca.listarLivros();
        biblioteca.listarClientes();
    }
}
