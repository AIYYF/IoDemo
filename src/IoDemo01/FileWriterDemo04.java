package IoDemo01;
import java.io.FileWriter;
/**
 * Writer  字符输出流  抽象类
 * FileWriter 文件字符输出流
 * @author zhouht
 *
 */
public class FileWriterDemo04 {
	public static void main(String[] args) throws Exception{
		//1创建fileWriter
		FileWriter fw=new FileWriter("d:\\file.txt");
		//2写入
		for (int i = 0; i <10; i++) {
			fw.write("好好学习，天天写代码\r\n");
			fw.flush();//立即刷新到硬盘里
		}
		//3关闭(关闭之前flush)
		fw.close();
	}
}
