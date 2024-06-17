public class Livro extends Material {
    private String autor;

    public Livro() {
        super();
    }

    public Livro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("ID: " + getId() + ", Título: " + getTitulo() + ", Autor: " + autor);
    }
}
