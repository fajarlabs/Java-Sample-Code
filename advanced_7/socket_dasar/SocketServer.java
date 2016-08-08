package advanced_7.socket_dasar;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

// Socket server menggunakan thread dengan menggunakan turunan Thread bukan 
// menggunakan interface runnable

public class SocketServer extends Thread {
	private ServerSocket serverSocket;

	public SocketServer(int port) throws IOException {
		
		// Port socket server
		serverSocket = new ServerSocket(port);
		// Batas timeout
		serverSocket.setSoTimeout(10000);
	}

	public void run() {
		while (true) {
			try {
				System.out.println("Menunggu client di port "+ serverSocket.getLocalPort() + "...");
				
				// Accept socket server
				Socket server = serverSocket.accept();
				System.out.println("Baru saja terhubung ke "+ server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				
				// UTF format
				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("Terimakasih telah terhubung dengan server "+ server.getLocalSocketAddress() + "\nGoodbye!");
				
				// Socket ditutup
				server.close();
				
			} catch (SocketTimeoutException s) {
				System.out.println("Socket timed out!");
				break;
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public static void lihatHasil() {
		// Port Server
		int port = 8081;
		
		try {
			Thread t = new SocketServer(port);
			t.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}