package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class streaming {

	public static void main(String[] args) throws IOException {
File f = new File("C:\\Users\\Parimal\\Desktop\\abcd.txt");
FileReader fw= new FileReader(f);
BufferedReader reader = new BufferedReader(fw);

String line=null;

while((line=reader.readLine())!=null)
{
	
System.out.println(line);
}


reader.close();
	}

}
