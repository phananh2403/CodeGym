package AutomatedTesting.ClassifierTriangle;

public class TriangleClassifier {
    private double firstEdge = 1.0;
    private double secondEdge = 1.0;
    private double thirdEdge = 1.0;

    public TriangleClassifier() {
    }

    public TriangleClassifier(double firstEdge, double secondEdge, double thirdEdge) {
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.thirdEdge = thirdEdge;
    }

    public double getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }

    public double getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
    }

    public double getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(double thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    public String triangleClassification() {
        boolean validTriangleTest = this.getFirstEdge() < (this.getSecondEdge() + this.getThirdEdge())
                && this.getSecondEdge() < (this.getFirstEdge() + this.getThirdEdge())
                && this.getThirdEdge() < (this.getSecondEdge() + this.getFirstEdge());

        boolean equilateralTriangleTest = this.getFirstEdge() == this.getSecondEdge()
                && this.getFirstEdge() == this.getThirdEdge();

        boolean isoscelesTriangleTest = this.getFirstEdge() == this.getSecondEdge()
                || this.getFirstEdge() == this.getThirdEdge()
                || this.getThirdEdge() == this.getSecondEdge();

        if (!validTriangleTest)
            return "không phải là tam giác";

        if (equilateralTriangleTest)
            return "tam giác đều";

        if (isoscelesTriangleTest)
            return "tam giác cân";
        return "tam giác thường";
    }
}
