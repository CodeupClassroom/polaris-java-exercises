package exceptions;

public class Widget {
    private String name;

    public Widget(String name) throws ValidationException {
        if(!isValidName(name)) {
            throw new ValidationException("Name must be between 1 and 100 characters.");
        }

        this.name = name;
    }

    // validators

    // name must be between 1 and 100 chars
    public boolean isValidName(String name) {
        if(name.length() < 1 || name.length() > 100) {
            return false;
        }
        return true;
    }

    // accessors

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
