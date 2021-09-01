package com.hao.radiation;

import java.lang.annotation.*;

/**
 * @ClassName test
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-09-01 09:08
 * @Copyright:
 **/
@myAnnotation
public class test {
   @myAnnotation
   public void test(){

   }

}
//定义一个注解
//Target 表示注解可以用在那个地方
@Target(value={ElementType.METHOD,ElementType.TYPE})
//Retention 表示注解在什么地方有效
//runtime>class>sources
@Retention(RetentionPolicy.RUNTIME)
//Documented表示注解是否生成在JAVADOC中
@Documented
//Inherited 子类可以继承父类的注解
@Inherited
@interface myAnnotation{

}
