package FileDemo;

import java.io.File;
import java.util.Date;


/**
 * File表示一个文件
 * @author zhouht
 *
 */
public class FileDemo01 {
	public static void main(String[] args) throws Exception{
		//第一个测试
		//createFile();
		getFile();
	}
	//1创建 （构造方法）、删除
	public static void createFile() throws Exception{
		//1创建File对象
		File file =new File("d:\\file.txt");
		System.err.println(file);
		//2创建
		boolean a=file.createNewFile();
		//判断
		if (a) {
			System.err.println("创建成功");
		}else {
			System.err.println("创建失败");
		}
		//3删除
		//3.1直接删除
//		boolean b=file.delete();
//		if(b) {
//			System.err.println("删除成功");
//		}else {
//			System.err.println("删除失败");
//		}
		//3.2退出jvm时,jvm帮你删除
		file.deleteOnExit();
		//设置删除时间
		System.err.println("5秒之后删除");
		Thread.sleep(5000);	
	}
	//2获取文件的属性、判断
	public static void getFile() throws Exception{
		//1创建文件
		File file=new File("d:\\java.txt");
		//2创建
		//2.1判断是否存在
		if (!file.exists()) {
			file.createNewFile();
			System.err.println("创建成功");
		}
		//3获取
		System.err.println("canExecute():"+file.canExecute());
		System.err.println("canRead():"+file.canRead());
		System.err.println("canWrite():"+file.canWrite());
		System.err.println("获取绝对路径： getAbsolutePath:"+file.getAbsolutePath());
		System.err.println("获取规范了路径:getCanonicalPath():"+file.getCanonicalPath());
		System.err.println("获取名字:getName():"+file.getName());
		System.err.println("获取路径：getPath():"+file.getPath());
		System.err.println("获取父目录:getParent():"+file.getParent());
		System.err.println("最后一次修改时间:lastModified():"+new Date(file.lastModified()).toString());
		System.err.println("文件长度:length():"+file.length());
		//4判断
		System.err.println("是否是文件：isfile():"+file.isFile());
		System.err.println("是否是隐藏文件：isHidden():"+file.isHidden());
		//5重命名
		File file2=new File("d:\\java.txt");
		System.err.println("重命名 renameTo():"+file.renameTo(file2));
	
	}
}
