package pl.coderslab.beans;

public class HelloWorld {

    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println(this.message);
    }
}
