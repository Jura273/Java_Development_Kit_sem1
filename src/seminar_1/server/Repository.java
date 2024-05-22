package seminar_1.server;

/**
 * Интерфейс Repository объявляет два абстрактных метода, которые реализуются в классе FileStorage.
 * @param <T> - текст.
 */
public interface Repository<T> {
    void saveMessage(T text);
    T readText();
}