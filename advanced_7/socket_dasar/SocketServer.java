package advanced_7.socket_dasar;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* Socket server menggunakan thread dengan menggunakan turunan 
 * Thread bukan menggunakan interface runnable 
 */

public class SocketServer extends Thread {
	private ServerSocket serverSocket;
	private int port;

	public SocketServer(int port) throws IOException {
		/* Port */
		this.port = port;
		
		/* Setting port socket-nya */
		serverSocket = new ServerSocket(port);
		
		/* Setting batas timeout-nya */
		int miliDetik = 10000;
		serverSocket.setSoTimeout(miliDetik);
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

	public void lihatHasil() {		
		try {
			Thread t = new SocketServer(port);
			t.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */		
	public static void main(String[] args) {
		/* Setting port */
		int port = 8081;
		
		try {
			SocketServer socketServer = new SocketServer(port);
			socketServer.lihatHasil();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}