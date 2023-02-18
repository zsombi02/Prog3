
package writer;

import java.io.*;

public class Main {

	public static void main(String[] args) {
	    try {
		FileWriter fw = new FileWriter("squares.txt");
		PrintWriter pw = new PrintWriter(fw);
		//PrintWriter pw = 
		// new PrintWriter("squares.txt", "ISO-8859-1");
		for (int i = 1; i <= 10; i++) {
			pw.println(i+"*"+i+" = "+(i*i));
			//pw.printf("%d*%d = %d\n", i, i, i*i);
		}
		pw.close();
            } catch (Exception ex) { 
		ex.printStackTrace();
	    }
	}
}