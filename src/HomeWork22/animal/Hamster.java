package HomeWork22.animal;


public class Hamster extends Animal {
    @Override
    public void voice() {
        System.out.println("Hamster2 voice HRUM-hrum");

    }

    @Override
    public String toString() {
        return super.toString() + " | Hamster2. Дополнение реализации родительского метода";

    }
}
