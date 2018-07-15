package IoDemo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用字节流复制图片
 * @author zhouht
 *
 */
public class Copy01 {
	public static void main(String[] args) throws Exception{
		//1创建文件字节输入流
		FileInputStream fis=new FileInputStream("d:\\图片\\file.jpg");
		FileOutputStream fos=new FileOutputStream("d:\\图片\\copy.jpg");
		//2一边读一边写
		byte[] buf=new byte[1024*4];
		int len=0;//定义一个变量
		while((len=fis.read(buf))!=-1) {
			fos.write(buf, 0, len);
		}
		//3关闭
		fis.close();
		fos.close();
		System.err.println("复制完毕");
	}
}
