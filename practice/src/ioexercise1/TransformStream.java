package ioexercise1;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jin
 * @Date 2022年09月2022/9/8日14:54
 * 处理流之二：转换流的使用
 * （1）转换流:属于字符流
 *     InputStreamReader：将一个字节的输入流转化为字符的输入流
 *     OutputStreamWrite：将一个字符的输出流转化为字节的输出流
 * （2）提供字节流与字符流之间的转换
 *
 * （3）解码：字节、字节数组   ---->  字符数组、字符串
 *     编码：字符数组、字符串  ---->  字节、字节数组
 * （4）字符集
 *
 */
public class TransformStream {
    @Test
    public void test1() throws IOException {

            FileInputStream fis =new FileInputStream("hello.txt");
           InputStreamReader isr = new InputStreamReader(fis,"GBK");
            //说明：参数2指明了使用哪个字符集，取决于文件hello.txt保存时使用的字符集
           char[]tr=new char[1024];
           int len;
           while((len=isr.read(tr))!=-1){
               String str=new String(tr,0,len);
               System.out.print(str);
           }
            if(isr!=null){
                    isr.close();
            }
        }
}


