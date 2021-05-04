package P18.lecture;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class A24Serialiazble {
	public static void main(String[] args) throws Exception {
		String file = "src/P18/lecture/output11.txt";
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Book());
		
		oos.close();
	}
}
