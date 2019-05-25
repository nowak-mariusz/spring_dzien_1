package pl.coderslab.beans;

public class EmailService implements MessageService {
    public void send() {
        System.out.println("Sending email");
    }
}
