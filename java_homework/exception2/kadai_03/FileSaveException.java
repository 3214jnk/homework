package java_homework.exception2.kadai_03;

public class FileSaveException extends Exception {
    public FileSaveException(String message) {
        super(message);
    }

    public FileSaveException(String message, Throwable cause) {
        super(message, cause);
    }
}