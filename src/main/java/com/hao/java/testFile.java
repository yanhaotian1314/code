package com.hao.java;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName testFile
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-08-16 13:28
 * @Copyright:
 **/
public class testFile {
    @Test
    public void test1(){
        File f = new File("e:\\java");
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test2(){
        InetAddress host = null;
        try {
            host = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String ip =host.getHostAddress();
        System.out.println("本机ip地址：" + ip);
    }
    @Test
    public void test3(){
        FileReader fr = null;
        try{
            fr = new FileReader("e:\\java\\test.txt");
            char[] buf = new char[1024];
            int len= 0;
            while((len=fr.read(buf))!=-1){
                System.out.println(new String(buf ,0,len));
            }
        }catch (IOException e){
            System.out.println("read-Exception :"+e.toString());
        }
        finally{
            if(fr!=null){
                try{
                    fr.close();
                }catch (IOException e){
                    System.out.println("close-Exception :"+e.toString());
                }
            }
        }
    }
    @Test
    public void test4(){
        FileReader fr=null;
        File f=new File("e:\\java\\test.txt");
        try {
            fr=new FileReader(f);
            char[] chars = new char[1024];
            int len=0;
            while ((len=fr.read(chars))!=-1) {
                System.out.println(new String(chars,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test5(){
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream("e:\\java\\test.txt");
            byte[] bytes = new byte[1204];
            int len=0;
            while ((len=fileInputStream.read(bytes))!=-1) {
                System.out.println(new String(bytes,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test6(){
        FileWriter fileWriter=null;
        File f=new File("e:\\java\\test.txt");
        try {
            if(!f.exists()){
                f.createNewFile();
            }
            fileWriter = new FileWriter(f);
            fileWriter.write("abc测试");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test7(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //step1:创建缓冲流对象：它是过滤流，是对节点流的包装
            br = new BufferedReader(new FileReader("e:\\java\\test.txt"));
            File f=new File("e:\\java\\test1.txt");
            bw = new BufferedWriter(new FileWriter(f));
            String str = null;
            while ((str = br.readLine()) != null) { //一次读取字符文本文件的一行字符
                bw.write(str); //一次写入一行字符串
                bw.newLine(); //写入行分隔符
            }
            bw.flush(); //step2:刷新缓冲区
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
// step3: 关闭IO流对象
            try {
                if (bw != null) {
                    bw.close(); //关闭过滤流时,会自动关闭它所包装的底层节点流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入信息(退出输入e或exit):");
//把"标准"输入流(键盘输入)这个字节流包装成字符流,再包装成缓冲流
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String s = null;
        try {
            while ((s = br.readLine()) != null) { //读取用户输入的一行数据 --> 阻塞程序
                if (s.equalsIgnoreCase("e") || s.equalsIgnoreCase("exit")) {
                    System.out.println("安全退出!!");
                    break;
                }
                //将读取到的整行字符串转成大写输出
                System.out.println("-->:"+s.toUpperCase());
                System.out.println("继续输入信息");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close(); //关闭过滤流时,会自动关闭它包装的底层节点流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test9(){
        DataOutputStream dos = null;
        try {    //创建连接到指定文件的数据输出流对象
            dos = new DataOutputStream(new FileOutputStream(
                    "e:\\java\\test1.txt"));
            dos.writeUTF("ab中国"); //写UTF字符串
            dos.writeBoolean(false); //写入布尔值
            dos.writeLong(1234567890L); //写入长整数
            System.out.println("写文件成功!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {    //关闭流对象
            try {
                if (dos != null) {
                    // 关闭过滤流时,会自动关闭它包装的底层节点流
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
