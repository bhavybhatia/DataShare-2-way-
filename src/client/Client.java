package client;
import java.util.*;
import java.io.*;
import java.net.*;

public class Client
{
	public static void main(String[] args) {
		try
		{
			String read;
			Scanner sc=new Scanner(System.in);
			Socket s=new Socket("172.20.10.5",6556);
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			while(true)
			{
				System.out.print("Enter Message  : ");
				String message=sc.nextLine();
				dos.writeUTF(message);
				System.out.println("...");
				read=dis.readUTF();
				System.out.println(read);
			}
			
		}
		catch(Exception e){}
	}
}
