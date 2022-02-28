public class VectorND extends Vector {
    public VectorND(double... coordinates) {
        super(coordinates);
    }

    public VectorND categorizer(double[] a) {
        return new VectorND(a);
    }
}
