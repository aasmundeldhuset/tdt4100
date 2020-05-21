package exceptions;

public class MyException extends RuntimeException {
    private final int z;
    
    public MyException(int z) {
        super("The number " + z + " is invalid");
        this.z = z;
    }
    
    public int getZ() {
        return z;
    }
}
