
package reader;

import java.io.*;

public class Main {

	public static void main(String[] args) {
	    try {
		FileReader fr = new FileReader("hello.txt");
		BufferedReader br = new BufferedReader(fr);
		while (true) {
			String line = br.readLine();
			if (line == null) break;
			System.out.println(line);
		}
		br.close();
            } catch (Exception ex) { 
		ex.printStackTrace();
	    }
	}
}