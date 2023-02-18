
package file;

import java.io.*;

public class Main {

	static void lsdir(File f, String tab) {
	   File[] list = f.listFiles();

	   for (int i = 0; i < list.length; i++) {
	      System.out.println(tab+list[i].getName());

	      if (list[i].isDirectory()) {
	         lsdir(list[i], tab+" ");
	      }

	   }
	}

	public static void main(String[] args) {
		// aktualis konyvtar
		File f = new File(System.getProperty("user.dir")); 
		lsdir(f,"");
	}
}