package IoDemo01;
import java.io.FileReader;
/**
 * 使用字符输入流读取文件
 * Reader ---》抽象类
 * 子类 FileReader  文件字符输入流
 * 
 * 由于改了编码为utf-8,eclipse读取的时候默认采用utf-8编码，但是在windows操作系统创建的文本文件采用gbk编码。
 * 中文编码：gb2312-->gbk--->gb18030
 * 繁体编码:big5
 * @author zhouht
 *
 */
public class FileReaderDemo03 {
	public static void main(String[] args) throws Exception{
		//1创建FileReader
		FileReader fr=new FileReader("d:\\file.txt");
		//2读取
		//2.1读取一个字符
//		int data=0;//定义一个变量
//		while((data=fr.read())!=-1) {
//			System.err.print((char)data);
//		}
		//2.2读取多个字符
		char[] buf=new char[1024];
		int len=0;//定义一个变量
		while((len=fr.read(buf))!=-1) { //判断
			for (int i = 0; i < len; i++) {
				System.err.print(buf[i]);
			}
		}
		//3关闭
		fr.close();
	}
}
