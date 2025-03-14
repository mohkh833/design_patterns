import ChainOfResponsibility.*;
import Observer.Editor;
import Observer.EmailNotificationListener;
import Observer.LogOpenListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
//        Server server = new Server();
//        server.register("admin@example.com", "admin_pass");
//        server.register("user@example.com", "user_pass");
//
//        Middleware middleware = Middleware.link(
//                new ThrottlingMiddleware(2),
//                new UserExistsMiddleware(server),
//                new RoleCheckMiddleware()
//        );
//
//        server.setMiddleware(middleware);
//
//        Client client = new Client(server);
//        try {
//            client.run();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

