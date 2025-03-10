package ChainOfResponsibility;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Server server;

    public Client(Server server) {
        this.server = server;
    }

    public void run() throws IOException {
        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
