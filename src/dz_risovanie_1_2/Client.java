package dz_risovanie_1_2;


import java.io.*;
import java.net.Socket;

public class Client implements Serializable {
    private static Socket clientSocket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static ObjectOutputStream out;
    public static void main(String[] args) {
        try{
            try{
                clientSocket = new Socket("localhost", 4004);
                out = new ObjectOutputStream(clientSocket.getOutputStream());
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                System.out.println("Передаю серверу объект телевизор");
                out.writeObject(new SimpleFrame1());
                out.flush();
                String answer = in.readLine();
                System.out.println(answer);

            }finally{
                System.out.println("Клиент был закрыт...");
                clientSocket.close();
                in.close();
                out.close();
            }
        }catch(IOException e){
            System.err.println(e);
        }
    }
}
