package com.hao.interfaces;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @ClassName interfaces
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-07-19 10:40
 * @Copyright:
 **/
public class interfaces {
    @Test
    public void test6() {
        BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };
        System.out.println(biPredicate.test("abc", "abc"));
        System.out.println("*******************************");
        BiPredicate<String, String> biPredicate1 = (s, s2) -> s.equals(s2);
        System.out.println(biPredicate1.test("abc", "abc"));
        System.out.println("*******************************");
        BiPredicate<String, String> biPredicate2 = String::equals;
        System.out.println(biPredicate2.test("abc", "abc"));
    }

    @Test
    public void test7() {
        Employee employee = new Employee(16, "Tom");
        Function<Employee, String> function = new Function<Employee, String>() {
            @Override
            public String apply(Employee employee) {
                return employee.getName();
            }
        };
        System.out.println(function.apply(employee));
        System.out.println("*******************************");
        Function<Employee, String> function1 = e -> e.getName();
        System.out.println(function1.apply(employee));
        System.out.println("*******************************");
        Function<Employee, String> function2 = Employee::getName;
        System.out.println(function2.apply(employee));
    }

    @Test
    public void test8() {
        Supplier<Employee> supplier = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };
        System.out.println(supplier.get());
        System.out.println("*******************************");
        Supplier<Employee> supplier1 = () -> new Employee();
        System.out.println(supplier1.get());
        System.out.println("*******************************");
        Supplier<Employee> supplier2 = Employee::new;
        System.out.println(supplier2.get());
    }

    @Test
    public void test9() {
        Function<Integer, Employee> function = new Function<Integer, Employee>() {
            @Override
            public Employee apply(Integer integer) {
                return new Employee(integer);
            }
        };
        Employee employee = function.apply(666);
        System.out.println(employee);
        System.out.println("*******************************");
        Function<Integer, Employee> function1 = f -> new Employee(f);
        Employee employee1 = function1.apply(666);
        System.out.println(employee1);
        System.out.println("*******************************");
        Function<Integer, Employee> function2 = Employee::new;
        Employee employee2 = function2.apply(666);
        System.out.println(employee2);
    }
    @Test
    public void test10() {
        Function<Integer,String[]> function=length->new String[length];
        String[] arr1=function.apply(5);
        System.out.println(Arrays.toString(arr1));
        System.out.println("*******************************");
        Function<Integer,String[]> function1=String[]::new;
        String[] apply = function1.apply(10);
        System.out.println(Arrays.toString(apply));
    }
}
