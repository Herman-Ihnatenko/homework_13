package HomeWork19;
//Task 2
//Неизменяемая переменная

//•	Объявите переменную final int MAX_USERS = 100;.
//•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
//•	Объясните, что произошло при попытке изменения значения.

public class Task_02 {
    final int MAX_USERS = 200;

    public static void main(String[] args) {
        //MAX_USERS = 2;
        //Во-первых переменная MAX-USERS в типе final, а это значит, что эту переменную нельзя изментить после первичного присвоения.
        //поэтому если я попытаюсь изменить значение, то компилятор выдает ошибку.
        //Во-вторых нельзя объявить переменную MAX-USERS, потому что нельзя объявить НЕ статическую
        //переменную в статическом методе (в нашем случяе - в метод main).
    }
}