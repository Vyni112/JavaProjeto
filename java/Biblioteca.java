import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Material> materiais;

    public Biblioteca() {
        this.materiais = new ArrayList<>();
    }

    public void adicionarMaterial(Material material) {
        materiais.add(material);
    }

    public void listarMateriais() {
        for (Material material : materiais) {
            material.exibirDetalhes();
        }
    }

    public Material visualizarMaterial(int id) {
        for (Material material : materiais) {
            if (material.getId() == id) {
                return material;
            }
        }
        return null;
    }

    public void excluirMaterial(int id) {
        Material material = visualizarMaterial(id);
        if (material != null) {
            materiais.remove(material);
        }
    }

    public void editarMaterial(int id, String novoTitulo) {
        Material material = visualizarMaterial(id);
        if (material != null) {
            material.setTitulo(novoTitulo);
        }
    }
}
