package org.example.http_server;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    public static void main(String[] args) {
        
    }
    
}

class SimpleHttpServer {

    public static void main(String[] args) throws IOException {
        // 创建一个监听在端口 8000 上的 HttpServer 实例
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        // 创建 HttpContext，并映射根路径到 MyHandler
        HttpContext context = server.createContext("/", new MyHandler(server));

        // 启动服务器
        server.start();

        System.out.println("Server is listening on port 8000");
    }

    // 实现 HttpHandler 接口
    static class MyHandler implements HttpHandler {
        
        private HttpServer server;

        public MyHandler(HttpServer server) {
            this.server = server;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Hello, World!";
            // 发送响应状态码
            exchange.sendResponseHeaders(200, response.length());


            OutputStream os = exchange.getResponseBody();

            if ("/close".equalsIgnoreCase(exchange.getRequestURI().getPath())) {
                // 发送响应体
                os.write((response + "-我要关闭了").getBytes());
                os.write(response.getBytes());
                os.close();
                server.stop(3);
                return;
            }
            os.write(response.getBytes());
            os.close();
        }
    }
}
