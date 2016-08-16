package advanced_7.socket_dasar;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient {
	
	public void lihatHasil() {
		
		/* Setting nama host-nya */
		String serverName = "127.0.0.1";
		
		/* Setting Port-nya */
		int port = 8081;
		
		try {
			System.out.println("Terhubung ke " + serverName + " di port "+ port);
			
			/* Instansiasi kelas Socket */
			Socket client = new Socket(serverName, port);
			
			System.out.println("Baru saja terhubung ke "+ client.getRemoteSocketAddress());
			
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			out.writeUTF("Hello dari " + client.getLocalSocketAddress());
			
			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("Server mengatakan " + in.readUTF());
			
			/* Tutup socket */
			client.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		SocketClient socketClient = new SocketClient();
		socketClient.lihatHasil();
	}
}
