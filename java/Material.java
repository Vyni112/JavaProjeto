public abstract class Material {
    private int id;
    private String titulo;
    private static int contadorId = 0;

    public Material() {
        this.id = ++contadorId;
    }

    public Material(String titulo) {
        this.id = ++contadorId;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract void exibirDetalhes();
}
