public class Revista extends Material {
    private int edicao;

    public Revista() {
        super();
    }

    public Revista(String titulo, int edicao) {
        super(titulo);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("ID: " + getId() + ", Título: " + getTitulo() + ", Edição: " + edicao);
    }
}
