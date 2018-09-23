package Day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readfromfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("E:\\AnjaliP\\newfile.txt");
		int i=0;
		while((i=fi.read())!=-1)
		{
			System.out.print((char)i);
		}

		fi.close();
	}

}
