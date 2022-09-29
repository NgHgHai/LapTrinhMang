package file;

import java.io.File;

public class DeleteAllFile {
	public static void main(String[] args) {
		DeleteAllFile d = new DeleteAllFile();
		File path = new File("D:\\laptrinhmang\\sach");
//		File path2 = new File("D:\\laptrinhmang\\sach\\TKHDT");
		System.out.println(d.deleteAll(path, 0));
//		d.delete(path);
//		System.out.println(d.delete(path));
	}

	private boolean delete(File path) {
		return path.delete();
	}

	private boolean deleteAll(File path, int i) {
		if (!path.exists()) {
			return false;
		}
		if (path.isDirectory()) {
			File[] child = path.listFiles();
			for (File file : child) {
				this.deleteAll(file, i + 1);
			}
		} else {
			if (path.delete()) {
				System.out.println("da xoa" + " + " + path.getName() );
			} return false;
		}
		
		return 	path.delete();

	}

}
