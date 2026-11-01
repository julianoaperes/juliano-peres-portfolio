import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;
public class PortfolioServer {
 public static void main(String[] args) throws Exception {
  Path root = Path.of("dist").toAbsolutePath().normalize();
  HttpServer server = HttpServer.create(new InetSocketAddress("127.0.0.1", 8080), 0);
  server.createContext("/", exchange -> {
   String path = exchange.getRequestURI().getPath();
   Path file = root.resolve(path.equals("/") ? "index.html" : path.substring(1)).normalize();
   if (!file.startsWith(root) || !Files.isRegularFile(file)) { exchange.sendResponseHeaders(404, -1); }
   else { byte[] body = Files.readAllBytes(file); exchange.getResponseHeaders().set("Content-Type", "text/html; charset=utf-8"); exchange.sendResponseHeaders(200, body.length); exchange.getResponseBody().write(body); }
   exchange.close();
  });
  server.start();
  System.out.println("Portfolio: http://127.0.0.1:8080");
 }
}
