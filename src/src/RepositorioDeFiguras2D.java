import java.util.ArrayList;
import java.util.List;

public class RepositorioDeFiguras2D {
    private List<FiguraGeometrica2D> figuras;

    public RepositorioDeFiguras2D() {
        this.figuras = new ArrayList<>();
    }
    public void adicionar(FiguraGeometrica2D figura) {
        figuras.add(figura);
    }
    public void remover(int posicao) {
        if (posicao >= 0 && posicao < figuras.size()) {
            figuras.remove(posicao);
        } else {
            System.out.println("Posição inválida.");
        }
    }
    public double recuperarArea(int posicao) {
        if (posicao >= 0 && posicao < figuras.size()) {
            return figuras.get(posicao).getArea();
        }
        System.out.println("Posição inválida.");
        return -1; // Retorno de erro
    }
    public double recuperarPerimetro(int posicao) {
        if (posicao >= 0 && posicao < figuras.size()) {
            return figuras.get(posicao).getPerimetro();
        }
        System.out.println("Posição inválida.");
        return -1; // Retorno de erro
    }
    public String recuperarTipo(int posicao) {
        if (posicao >= 0 && posicao < figuras.size()) {
            return figuras.get(posicao).getTipoFigura();
        }
        return "Posição inválida.";
    }
}