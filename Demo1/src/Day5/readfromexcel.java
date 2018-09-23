package Day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class readfromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi;
		fi=new FileInputStream("E:\\AnjaliP\\Testdemo.xls");
		HSSFWorkbook hw= new HSSFWorkbook(fi);
		HSSFSheet hs = hw.getSheetAt(0);
		for(int i=1;i<hs.getLastRowNum();i++)
		{
			int j=1;
			HSSFCell id,password;
			id=hs.getRow(i).getCell(j);
			password= hs.getRow(i).getCell(j+1);
			System.out.print(id.toString()+"\t");
			System.out.println(password.toString());
		}
		
		fi.close();
		
	}

}
