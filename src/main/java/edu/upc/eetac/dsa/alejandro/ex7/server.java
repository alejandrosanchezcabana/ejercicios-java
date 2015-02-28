package edu.upc.eetac.dsa.alejandro.ex7;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class server {
	private final static int SERVER_PORT=12345;
	
	public void main (String[] args) throws IOException{
		int port = (args.length==1) ? Integer.parseInt(args[0]) : SERVER_PORT;
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yy HH:mm:ss");
		ServerSocket serverSocket= new ServerSocket(port);
		while (true){
			Socket socket =serverSocket.accept();
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			writer.println(sdf.format(System.currentTimeMillis()));
			writer.flush();
		}
	}
}
