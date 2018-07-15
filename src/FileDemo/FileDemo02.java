package FileDemo;

import java.io.File;
import java.io.FilenameFilter;

/**
 * File表示一个文件夹
 * @author zhouht
 *
 */
public class FileDemo02 {
	public static void main(String[] args) {
		//createDirectory();
		getDir();
	}
	//1创建、删除
	public static void createDirectory() {
		//1创建
		File dir=new File("d:\\aaa\\bbb\\ccc");
		System.err.println(dir.toString());
		boolean b=dir.mkdirs();//创建多级文件夹
		if(b) {
			System.err.println("创建成功");
		}else {
			System.err.println("创建失败");
		}
		//2删除
		System.err.println("删除文件夹"+dir.delete());//这里只是删除最里面文件夹，并没有全删除
	}
	//2获取
	public static void getDir() {
		//1创建文件夹
		File dir=new File("d:\\file");
		if (!dir.exists()) {
			dir.mkdirs();
			System.err.println("创建目录");
		}
		//2获取
		System.err.println("获取绝对路径getAbsolutePath():"+dir.getAbsolutePath());
		System.err.println("获取名字getName():"+dir.getName());
		System.err.println("获取路径getPath():"+dir.getPath());
		System.err.println("获取父目录getParent():"+dir.getParent());
		//3判断
		System.err.println("是否是文件夹isDirectory():"+dir.isDirectory());
		//4获取文件夹中的子文件夹和文件
		//4.1获取所有
		System.err.println("-----dir2.list()------");
		File dir2=new File("d:\\User");
		String[] dirs=dir2.list();
		for (String string : dirs) {
			System.err.println(string);
		}
		System.err.println("-----dir2.listFiles()------");
		File[] files=dir2.listFiles();
		for (File file : files) {
			System.err.println(file.toString());
		}
		System.err.println("----扩展名是.jpg的文件");
		String[] dirs2=dir2.list(new FilenameFilter() {
			/**
			 * true:表示符合条件
			 * false:表示不符合条件
			 */
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith(".jpg")) {
					return true;
				}
				return false;
			}
		});
		for (String string : dirs2) {
			System.err.println(string);
		}
		//5.listRoots() 列出可用系统的根
		System.err.println("------列出可用系统的根-----");
		File[] roots=File.listRoots();
		for (File file : roots) {
			System.err.println(file);
		}
	}
}
