package exe03;

public class Main {

    public static void main(String[] args) {

        Livro livroFavorito = new Livro("Senhor dos Aneis", 550);
        Leitor leitor = new Leitor("João Pedro", livroFavorito);

        leitor.getLivroFavorito().adicionarPaginasLidas(150);
        System.out.println("Progresso: " + leitor.getLivroFavorito().verificarProgresso() + "%");

        Livro livro2 = new Livro("Dune", 300);

        leitor.adicionarLivro(livro2);

        leitor.removerLivro(livroFavorito);
    }
}
