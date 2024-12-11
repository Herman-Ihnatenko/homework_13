package HomeWork26.Task_01;

/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.

Требования:
Класс должен иметь конструктор, принимающий два параметра типа T.
Методы:
T getFirst() — возвращает первый элемент.
T getSecond() — возвращает второй элемент.
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.

Пример использования:
Pair<String> pair = new Pair<>("Hello", "World");
System.out.println(pair.getFirst()); // Вывод: Hello
System.out.println(pair.getSecond()); // Вывод: World

pair.swap();
System.out.println(pair.getFirst()); // Вывод: World
System.out.println(pair.getSecond()); // Вывод: Hello
 */
public class Pair <T>{
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T value) {
        this.first = value;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T value) {
        this.second = value;
    }

    public void swap() {
        T temp = first;
        first = second;
        second = temp;
    }

    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "World");

        System.out.println(pair.getFirst()); // Вывод: Hello
        System.out.println(pair.getSecond()); // Вывод: World

        pair.swap();
        System.out.println(pair.getFirst()); // Вывод: World
        System.out.println(pair.getSecond()); // Вывод: Hello
    }

}
