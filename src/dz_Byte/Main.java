package dz_Byte;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> bytes = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream("byte");
        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read();
            if(!bytes.contains(data)) {
                bytes.add(data);
            }
            Collections.sort(bytes);
            Collections.reverse(bytes);
        }
        for (int a : bytes){
            System.out.print(a + " ");
        }
        inputStream.close(); // закрываем поток

    }
}
