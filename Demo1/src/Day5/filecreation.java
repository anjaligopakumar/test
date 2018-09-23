package Day5;

import java.io.File;
import java.io.IOException;

public class filecreation {
public static void main(String[] args) throws IOException 
{
	File myfile=new File("E:\\AnjaliP\\libs\\abc.txt");
	boolean check= myfile.createNewFile();
	System.out.println(check);	
}
}
