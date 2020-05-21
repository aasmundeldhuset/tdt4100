public class NameException extends RuntimeException {
    private String name;
    
    public NameException(String name) {
        super("The name '" + name + "' is not valid");
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
