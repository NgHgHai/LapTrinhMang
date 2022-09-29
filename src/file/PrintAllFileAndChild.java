package file;

import java.io.File;
import java.util.Iterator;

public class PrintAllFileAndChild {
	public static void main(String[] args) {
		PrintAllFileAndChild d = new PrintAllFileAndChild();
//		File path = new File("D:\\laptrinhmang"); 
//		File path = new File("D:\\laptrinhmang\\sach1"); 
		File path = new File("D:"); 
//		File[] file = path.listFiles();
//		for (File fileChild : file) {
//			d.listChild(fileChild, 0);
//		}
//		System.out.println(path.isFile());
		d.listChild(path, 0);

	}

	private void listChild(File path, int i) {
		if (path.isHidden()) {
			return;
		}
		if (path.isDirectory()) {
			System.out.println(getPadding(i) + " - " + path.getName() +" ----- " + path.length() );
			File[] child = path.listFiles();
			for (File file : child) {
				this.listChild(file, i + 1);
			}
		} else {
			System.out.println(getPadding(i) + " + " + path.getName()+" ----- " + path.length() + " kb");
		}

	}

	private String getPadding(int level) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < level; i++) {
			sb.append("     ");
		}
		return sb.toString();
	}
	

}
