package clientExample;

import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String serverName = args[0]; //Specify name of the server (this case localhost).
		
		int port = Integer.parseInt(args[1]); // Will get the argument.
		
		try
		{
			System.out.println("Connecting to " + serverName + "at port number " + port);
			
			Socket client = new Socket(serverName, port); // To create the actual connection.
			
			System.out.println("Connected to " + client.getRemoteSocketAddress()); // It will show where is connected to.
			OutputStream out = client.getOutputStream();
			DataOutputStream data = new DataOutputStream(out);
			
			data.writeUTF("Hello from " + client.getLocalSocketAddress());
			
			InputStream in = client.getInputStream();
			DataInputStream inputS = new DataInputStream(in);
			
			System.out.println("Server says" + inputS.readUTF());
			client.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
	}

}
