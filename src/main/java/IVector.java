/**
 * Интерфейс для класса Vector
 */
public interface IVector {

    /**
     * Метод для нахождения скалярного произведения двух векторов.
     * @param vector вектор ввеенный пользователем
     * @return скалярное произведение двух векторов
     */
    double scalar(Vector vector);

    /**
     * Метод для нахождения суммы двух векторов
     * @param vector вектор ввеенный пользователем
     * @return сумма двух векторов
     */
    Vector add(Vector vector);


    /**
     * Метод для нахождения разница двух векторов.
     * @param vector вектор ввеенный пользователем
     * @return разница между двумя векторами
     */
    Vector subtract(Vector vector);
}
