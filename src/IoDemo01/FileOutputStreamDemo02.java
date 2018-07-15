package IoDemo01;
import java.io.FileOutputStream;
/**
 * OutputStream 字节输出流  抽象类
 * FileOutputStream  文件字节输出流 
 * @author zhouht
 *
 */
public class FileOutputStreamDemo02 {
	public static void main(String[] args) throws Exception{
		//1创建文件字节输出流
		FileOutputStream fos=new FileOutputStream("d:\\file.txt",true);//true表示追加
		//2写入
		//2.1每次一个字节
		fos.write('w');
		fos.write('w');
		fos.write('w');
		
		//2.2写入多个
		String string="iegod";
		byte[] bytes=string.getBytes();
		fos.write(bytes);
		//3关闭
		fos.close();
 	}
}
