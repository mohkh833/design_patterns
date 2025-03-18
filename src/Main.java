import ChainOfResponsibility.*;
//import Observer.Editor;
import Mediator.ChatMediator;
import Mediator.ChatMediatorImpl;
import Mediator.User;
import Mediator.UserImpl;
import Observer.EmailNotificationListener;
import Observer.LogOpenListener;
import command.Editor;
import interpreter.AdditionExpression;
import interpreter.Expression;
import interpreter.NumberExpression;
import interpreter.SubtractionExpression;
import iterator.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
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

//        Editor editor = new Editor();
//        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
//        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
//
//        try {
//            editor.openFile("test.txt");
//            editor.saveFile();
//        } catch (Exception e){
//            e.printStackTrace();
//        }

//        Editor editor = new Editor();
//        editor.init();


//        Expression five = new NumberExpression(5);
//        Expression three = new NumberExpression(3);
//        Expression two = new NumberExpression(2);
//
//        Expression addition = new AdditionExpression(five, three); // (5 + 3)
//        Expression subtraction = new SubtractionExpression(addition, two); // (5 + 3) - 2
//
//        System.out.println("Result: " + subtraction.interpret());



//        System.out.println("Please specify social network to target spam tool (default:Facebook):");
//        System.out.println("1. Facebook");
//        System.out.println("2. LinkedIn");
//        String choice = scanner.nextLine();
//
//        SocialNetwork network;
//        if (choice.equals("2")) {
//            network = new LinkedIn(createTestProfiles());
//        }
//        else {
//            network = new Facebook(createTestProfiles());
//        }
//
//        SocialSpammer spammer = new SocialSpammer(network);
//        spammer.sendSpamToFriends("anna.smith@bing.com",
//                "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?");
//        spammer.sendSpamToCoworkers("anna.smith@bing.com",
//                "Hey! This is Anna's boss Jason. Anna told me you would be interested in [link].");
//    }
//
//    public static List<Profile> createTestProfiles() {
//        List<Profile> data = new ArrayList<Profile>();
//        data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
//        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
//        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
//        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
//        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
//        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
//        return data;

        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Pankaj");
        User user2 = new UserImpl(mediator, "Lisa");
        User user3 = new UserImpl(mediator, "Saurabh");
        User user4 = new UserImpl(mediator, "David");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
    }


