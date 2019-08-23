package serverExample;

import java.net.*;
import java.io.*;

public class Server extends Thread {
	
	private ServerSocket serverSocket;
	
	public Server(int port) throws IOException
	{
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(2000);
	}
	
	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("Waiting for client on port " + serverSocket.getLocalPort());
				
				Socket server = serverSocket.accept();
				
				System.out.println("Connected to " + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				
				System.out.println(in.readUTF());
				DataOutputStream data = new DataOutputStream(server.getOutputStream());
				data.writeUTF("Thanks for connecting to " + server.getLocalSocketAddress());
				
				server.close();
			}
			catch(SocketTimeoutException ex)
			{
				System.out.println("Took to long to connect.");
				break;
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int port = Integer.parseInt(args[0]);
		
		try 
		{
			Thread t = new Server(port);
			t.start();
		}
		catch(IOException ex)
		{
				ex.printStackTrace();
		}

	}

}
