package server;
import java.util.*;
import java.io.*;
import java.net.*;
public class Server {
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			ServerSocket ss=new ServerSocket(3000);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			String str=dis.readUTF();
			System.out.println(str);
			System.out.print("Enter Message : ");
			String message;
			message=sc.nextLine();
			dos.writeUTF(message);
			dos.close();
			dis.close();
			s.close();
			ss.close();
		}
		catch(Exception e){System.out.println("Not running");}
	}
}
