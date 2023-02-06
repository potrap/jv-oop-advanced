package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[]{figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure(), figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(), figureSupplier.getRandomFigure()};
        for (Figure figure : figures) {
            figure.printInfo();
        }
    }
}
