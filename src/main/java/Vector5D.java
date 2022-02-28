/**
 * Пятимерный вектор
 */
public class Vector5D extends Vector {
    public Vector5D(double x, double y, double z, double j, double k) {
        super(new double[]{x, y, z, j, k});
    }

    public Vector5D categorizer(double[] a) {
        return new Vector5D(a[0],a[1],a[2],a[3],a[4]);
    }
}
