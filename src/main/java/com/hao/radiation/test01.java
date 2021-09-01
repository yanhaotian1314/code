package com.hao.radiation;

import java.util.ArrayList;

/**
 * @ClassName test01
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-09-01 09:33
 * @Copyright:
 **/
public class test01 extends Object{
   //@Override 重新的注解
   @Override
   public String toString() {
      return super.toString();
   }
   //@Deprecated 不推荐程序员使用，但是可以使用，或者存在更好的方式
   @Deprecated
   public static void test(){
      System.out.println("Deprecated");
   }
   //@SuppressWarnings压制警告
   @SuppressWarnings(value = "all")
   public void test02(){
      ArrayList<Object> arrayList = new ArrayList<>();
   }

   public static void main(String[] args) {
      test();
   }
}
