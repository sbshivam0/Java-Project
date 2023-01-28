package fileHandling;
import java.io.*;

public class Wp {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		String data="my life sucks now0";
		FileOutputStream out=new FileOutputStream("d://charstream.txt");
		for(int i=0; i<data.length();i++) {
			out.write(data.charAt(i));
		}
		out.close();

	}

}
