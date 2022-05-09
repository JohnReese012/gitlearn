import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 7777);


        // 从服务器接收的信息
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String info = null;
        while ((info = br.readLine()) != null) {
            String i = "123";
            info += info + i;
            System.out.println("我是客户端，服务器返回信息：" + info);
        }
    }
}
