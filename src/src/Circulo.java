public class Quadrado implements FiguraGeometrica2D {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return this.lado * this.lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * this.lado;
    }

    @Override
    public String getTipoFigura() {
        return "Quadrado";
    }
}