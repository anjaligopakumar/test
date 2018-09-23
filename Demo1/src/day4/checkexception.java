package day4;

public class checkexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int b=50/0;
			int a[]= {1,2,3};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//e.printStackTrace();
			System.out.println("error in index length");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.fillInStackTrace());
			System.out.println("dividing by 0");
		}
		finally
		{
			System.out.println("check index");
		}

	}

}
