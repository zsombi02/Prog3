
package stdin;

import java.io.*;

public class Main {

	public static void main(String[] args) {
	    try {
		InputStreamReader isr = 
			new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			String line = br.readLine();						if (line == null) break;
			System.out.println(line);
		}
		br.close();
            } catch (Exception ex) { 
		ex.printStackTrace();
	    }
	}
}