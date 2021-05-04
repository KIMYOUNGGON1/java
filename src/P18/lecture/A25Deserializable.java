package P18.lecture;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class A25Deserializable {
	public static void main(String[] args) throws Exception{
		String path = "src/P18/lecture/output11.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Book book = (Book) ois.readObject();
		System.out.println(book);
		
		ois.close();
	}
}
