package IoDemo01;
import java.io.FileInputStream;
/**
 * 使用字节输入流读取文件
 * InputStream 抽象类 读取的方法
 * 子类 FileInputStream
 * @author zhouht
 *
 */
public class FileInputStreamDemo01 {
	public static void main(String[] args) throws Exception{
		//1创建fileInputStream
		FileInputStream fis =new FileInputStream("d:\\input.txt");
//		//2读取
//		//2.1一次读取一个字节
//		int data=0;//声明一个变量
//		while((data=fis.read())!=-1) {
//			System.err.print((char)data);
//		}
		
		//2.2一次读取多个字节
		byte[] buf=new byte[1024];//可以存储1024个字节
		int len=0;//定义一个变量
		//遍历
		while((len=fis.read(buf))!=-1) {
			for (int i = 0; i < len; i++) {
				System.err.print((char)buf[i]);
			}
		}
		//3关闭
		fis.close();
	}
}
