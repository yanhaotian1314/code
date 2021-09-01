package com.hao.radiation;

/**
 * @ClassName test06
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-09-01 13:31
 * @Copyright:
 **/
public class test06 {
   public static void main(String[] args) {
      A a = new A();
      System.out.println(a.m);
   }
}
class A{
   static {
      System.out.println("A类静态代码块初始化");
      m=300;
   }
   static int m=100;
   public A(){
      System.out.println("A类的无参构造初始化");
   }
}