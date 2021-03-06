import base.Tamagotchi;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {

    public static void main(String... args) throws Exception {


        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        Server server = new Server(8080);
        server.setHandler(contextHandler);
        server.start();
        server.join();
    }
}
