package gb.lesson2.wrong;

public class WrongOperationException extends Exception {
    public WrongOperationException(String operation) {
         super("Неизвестная операция " + operation);
    }

    public WrongOperationException(String operation, Throwable cause) {
        this(operation);
    }
}