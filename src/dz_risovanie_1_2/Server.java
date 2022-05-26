package dz_risovanie_1_2;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static Socket clientSocket;
    private static ServerSocket server;
    private static ObjectInputStream in;
    private static BufferedWriter out;
    public static void main(String[] args) {
        try{
            try{
                server = new ServerSocket(4004);
                System.out.println("Сервер запущен!");
                clientSocket = server.accept();
                try{
                    in = new ObjectInputStream(clientSocket.getInputStream());
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    SimpleFrame1 frame = (SimpleFrame1)in.readObject();
                    out.write("Сервер принял объект.");
                    out.flush();

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    clientSocket.close();
                    in.close();
                    out.close();
                }

            }finally {
                System.out.println("Сервер закрыт!");
                server.close();
            }
        }catch (IOException e){
            System.err.println(e);
        }
    }
}
