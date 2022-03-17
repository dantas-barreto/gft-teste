package exe03;

import java.util.ArrayList;
import java.util.List;

public class Leitor {

    private String leitor;
    private Livro livroFavorito;
    private List<Livro> estanteLivros;

    public Leitor(String leitor, Livro livroFavorito) {
        this.leitor = leitor;
        this.livroFavorito = livroFavorito;
        this.estanteLivros = new ArrayList<>();
        adicionarLivro(livroFavorito);
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    public Livro getLivroFavorito() {
        return livroFavorito;
    }

    public void setLivroFavorito(Livro livroFavorito) {
        this.livroFavorito = livroFavorito;
    }

    public List<Livro> getEstanteLivros() {
        return estanteLivros;
    }

    public void adicionarLivro(Livro livro) {
        this.estanteLivros.add(livro);
    }

    public void removerLivro(Livro livro) {
        this.estanteLivros.remove(livro);
    }
}
