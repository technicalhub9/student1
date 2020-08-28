package Pack1;
import java.io.*;
public class Files1 
{
	public static void main(String[] args) 
			//throws Exception
	{
		int c = 0;
		File f = new File("E:\\");
// f var holds id of e:\\ drive
		String[] s = f.list();
// enhanced for loop
		for(String s1 : s)
		{
			File f1 = new File(f,s1);
		// f1 var holds id of s1 present in f location
			if(f1.isFile())
			{
			System.out.println(s1);
			c++;
			}
		}
		System.out.println(" total files = "+c);
	}
}
