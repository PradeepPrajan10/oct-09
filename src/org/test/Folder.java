package org.test;

import java.io.File;
import java.io.IOException;

public class Folder {
public static void main(String[] args) throws IOException {

	File f = new File("E:\\Prajan");

	boolean Fi = f.createNewFile();
	
	System.out.println(Fi);
	


}
}
