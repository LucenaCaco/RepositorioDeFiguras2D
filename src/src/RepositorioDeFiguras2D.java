import java.util.ArrayList;
import java.util.List;

public class RepositorioDeFiguras2D {
    private List<FiguraGeometrica2D> figuras;

    public RepositorioDeFiguras2D() {
        this.figuras = new ArrayList<>();
    }

    // Adiciona uma figura ao repositório
    public void adicionar(FiguraGeometrica2D figura) {
        figuras.add(figura);
    }

    // Remove a figura com base na posição (índice)
    public void remover(int posicao) {
        if (posicao >= 0 && posicao < figuras.size()) {
            figuras.remove(posicao);
        } else {
            System.out.println("Posição inválida.");
        }
    }

    // Recupera a área da figura em uma certa posição
    public double recuperarArea(int posicao) {
        if (posicao >= 0 && posicao < figuras.size()) {
            return figuras.get(posicao).getArea();
        }
        System.out.println("Posição inválida.");
        return -1; // Retorno de erro
    }

    // Recupera o perímetro da figura em uma certa posição
    public double recuperarPerimetro(int posicao) {
        if (posicao >= 0 && posicao < figuras.size()) {
            return figuras.get(posicao).getPerimetro();
        }
        System.out.println("Posição inválida.");
        return -1; // Retorno de erro
    }

    // Recupera o tipo da figura em uma certa posição
    public String recuperarTipo(int posicao) {
        if (posicao >= 0 && posicao < figuras.size()) {
            return figuras.get(posicao).getTipoFigura();
        }
        return "Posição inválida.";
    }
}