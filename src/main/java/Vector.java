import java.util.Arrays;
import java.util.Objects;

public abstract class Vector implements IVector {
    /**
     * Размерность вектора
     */
    private int dimension;
    /**
     *  кординаты вектора
     */
    private double[] coordinates;

    /**
     * Метод для получения размерности вектора
     * @return размерность вектора
     */
    public int getDimension() {
        return dimension;
    }

    /**
     * Метод для получения координат вектора
     * @return координаты вектора
     */
    public double[] getCoordinates() {
        return coordinates;
    }

    /**
     *Метод абстрактный
     * @param a вектор
     */
    public abstract Vector categorizer(double[] a);

    /**
     *Коснтруктор
     * @param coordinates координаты вектора
     */
    public Vector(double[] coordinates) {
        dimension = coordinates.length;
        this.coordinates = new double[dimension];
        System.arraycopy(coordinates, 0, getCoordinates(), 0, dimension);
    }

    @Override
    public double scalar(Vector vector) {
        double product = 0;
        for (int i = 0; i < this.dimension; i++) {
            product += this.coordinates[i] * vector.coordinates[i];
        }
        return product;
    }


    @Override
    public Vector add(Vector vector) {
        var result = new double[this.getDimension()];
        System.arraycopy(this.coordinates, 0, result, 0, this.dimension);
        for (int i = 0; i < this.getDimension(); i++) {
            result[i] += vector.coordinates[i];
        }
        return categorizer(result);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append('(');
        for (int i = 0; i < dimension; i++) {
            s.append(coordinates[i]);
            if (i < dimension - 1) s.append(", ");
        }
        s.append(')');
        return s.toString();
    }

    @Override
    public Vector subtract(Vector vector) {
        var result = new double[getDimension()];
        System.arraycopy(this.coordinates, 0, result, 0, this.dimension);
        for (int i = 0; i < this.getDimension(); i++) {
            result[i] -= vector.coordinates[i];
        }
        return categorizer(result);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return dimension == vector.dimension &&
                Arrays.equals(coordinates, vector.coordinates);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(dimension);
        result = 31 * result + Arrays.hashCode(coordinates);
        return result;
    }


}