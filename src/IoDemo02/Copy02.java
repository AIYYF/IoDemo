package IoDemo02;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用字符流复制图片,乱码
 * @author zhouht
 *
 */
public class Copy02 {
	public static void main(String[] args) throws Exception{
		//1创建FileReader
		FileReader fr=new FileReader("d:\\图片\\file.jpg");
		FileWriter fw=new FileWriter("d:\\图片\\copy2.jpg");
		//2边读边写
		char[] buf=new char[1024*4];
		int len=0;
		while((len=fr.read(buf))!=-1) {
			fw.write(buf,0,len);
		}
		//3关闭
		fr.close();
		fw.close();
		System.err.println("复制完毕");
	}
}
