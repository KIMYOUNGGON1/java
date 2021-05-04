package P18.textbook.exercise.ex07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		String path = "src/P18/textbook/exercise/ex07/AddLineNumberExample.java";
		Reader rd  = new FileReader(path);
		BufferedReader br = new BufferedReader(rd);
		
		String line = null;
		int cnt = 0;
		
		while ((line = br.readLine()) != null) {
			cnt++;
			System.out.println(cnt + ":" + line);
		}
				
		
		br.close();
		rd.close();
	}
}
