package com.hao.radiation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName test02
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-09-01 09:48
 * @Copyright:
 **/
public class test02 extends Object{
    //注解可以显示赋值,如果没有默认值，就需要赋值
    @myAnnotation2(age = 18)
    public void test(){

    }

    @myAnnotation3("浩")
    public void test1(){

    }

}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface myAnnotation2{
    //注解的参数：参数类型+参数名();
    String name() default "";
    int age() ;
    int id() default -1; //如果默认值为-1,代表不存在
    String[] schools() default {"西部开源","清华大学"};
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface myAnnotation3{
    String value();
}
