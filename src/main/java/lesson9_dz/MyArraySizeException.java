package lesson9_dz;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
    }

    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyArraySizeException(Throwable cause) {
        super(cause);
    }

}
