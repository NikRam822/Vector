/**
 * Трехмерный вектор
 */
public class Vector3D extends Vector {
    public Vector3D(double x, double y, double z) {
        super(new double[]{x, y, z});
    }

    public Vector3D categorizer(double[] a) {
        return new Vector3D(a[0],a[1],a[2]);
    }
}
