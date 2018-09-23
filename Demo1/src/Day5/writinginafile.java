package Day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writinginafile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fs = new FileOutputStream("E:\\AnjaliP\\nefile.txt");
		String str= "I live in India";
		byte b[] = str.getBytes();
		fs.write(b);
		fs.close();

	}

}
