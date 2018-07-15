package FileDemo;

import java.io.File;

/**
 * 列出文件夹中所有的子文件夹和文件，包括子文件夹中文件和文件夹
 * @author zhouht
 *
 */
public class FileDemo03 {
	public static void main(String[] args) {
		//listFile(new File("d:\\file"));
		deleteDir(new File("d:\\file"));
	}
	//1 列出文件夹中所有的子文件夹和文件，包括子文件夹中文件和文件夹
	public static void listFile(File dir) {
		System.err.println(dir.getAbsolutePath());
		File[] files=dir.listFiles();
		if (files!=null&&files.length>0) {
			for (File file : files) {
				if (file.isDirectory()) {
					//递归
					listFile(file);
				}else {
					System.err.println(file.getAbsolutePath());
				}
			}
		}
	}
	//2递归删除文件夹
	public static void deleteDir(File dir) {
		File[] files=dir.listFiles();
		if (files!=null&&files.length>0) {
			for (File file : files) {
				if (file.isDirectory()) {
					deleteDir(file);
				}else {
					//删除文件
					System.err.println(file.toString()+"---"+file.delete());
				}
			}
		}
		//删除文件夹
		System.err.println(dir.toString()+"*******"+dir.delete());
	}
}
