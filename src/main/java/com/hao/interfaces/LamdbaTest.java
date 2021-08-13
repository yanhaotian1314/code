package com.hao.interfaces;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @ClassName LamdbaTest
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-08-12 13:53
 * @Copyright:
 **/
public class LamdbaTest {
   @Test
   public void test(){
      ArrayList<String> arrayList = new ArrayList<>();
      arrayList.add("西瓜");
      arrayList.add("苹果");
      arrayList.add("橘子");
      Stream<String> stream = arrayList.parallelStream();
      stream.forEach(System.out::println);

      System.out.println("***************************");

      ArrayList<String> arrays=new ArrayList<>();
      arrays.add("xigua");
      arrays.add("pinguo");
      arrays.add("juzi");
      Stream<String> stringStream=arrays.parallelStream();
      stringStream.forEach(System.out::println);

      System.out.println("***************************");

      Stream<Integer> is = Stream.of(10, 20, 30, 40, 50);
      is.forEach(System.out::println);

      System.out.println("***************************");

      Stream<Integer> integerStream=Stream.of(10,20,30,40,50);
      integerStream.forEach(System.out::println);

      System.out.println("***************************");

      //迭代流
      Stream<Integer> iterate = Stream.iterate(0, x -> x + 2);
      iterate.limit(10).forEach(System.out::println);

      System.out.println("***************************");

      Stream<Integer> iterates=Stream.iterate(0,x->x+2);
      iterates.limit(6).forEach(System.out::println);

   }
   @Test
   public void test1(){
      //生成流
      Stream<Integer> generate = Stream.generate(() -> new Random().nextInt(100));
      generate.limit(1).forEach(System.out::println);

      System.out.println("***************************");

      Stream<Integer> integerStream=Stream.generate(()-> new Random().nextInt(100));
      integerStream.limit(1).forEach(System.out::println);

      System.out.println("***************************");
      IntStream is1 = IntStream.of(10,20,30);
      is1.forEach(System.out::println);
      IntStream is2 = IntStream.range(0,5);//不包括5
      is2.forEach(System.out::println);
      IntStream is3 = IntStream.rangeClosed(0,5);//包括5
      is3.forEach(System.out::println);

      System.out.println("***************************");
      IntStream intStream = IntStream.of(10, 20, 30);
      intStream.forEach(System.out::println);
      IntStream range = IntStream.range(0, 5);
      range.forEach(System.out::println);
      IntStream intStream1 = IntStream.rangeClosed(0, 5);
      intStream1.forEach(System.out::println);

   }

   @Test
   public void test2(){
      ArrayList<Employee> arrayList = new ArrayList<>();
      arrayList.add(new Employee(10000, "小明"));
      arrayList.add(new Employee(15000, "小李"));
      arrayList.add(new Employee(20000, "小红"));
      arrayList.add(new Employee(25000, "小刚"));
      Stream<Employee> stream = arrayList.stream();
      //过滤方法filter()
      Stream<Employee> employeeStream = stream.filter(e -> e.getId() > 15000);
      employeeStream.forEach(System.out::println);

      System.out.println("***************************");

      arrayList.stream().filter(t->t.getId()>15000).forEach(System.out::println);

   }
   @Test
   public void test3(){
      ArrayList<Employee> arrayList = new ArrayList<>();
      arrayList.add(new Employee(10000, "小明"));
      arrayList.add(new Employee(15000, "小李"));
      arrayList.add(new Employee(20000, "小红"));
      arrayList.add(new Employee(25000, "小刚"));
      Stream<Employee> stream = arrayList.stream();
      //限制方法limit() 括号里加入限制获得元素的个数
//      Stream<Employee> limit = stream.limit(3);
//      limit.forEach(System.out::println);
//
//      System.out.println("***************************");
//
//      arrayList.stream().limit(3).forEach(System.out::println);

      //跳过元素skip() 括号里加入跳过元素的个数 输入跳过之后的数据
//      Stream<Employee> skip = stream.skip(2);
//      skip.forEach(System.out::println);
//
//      System.out.println("***************************");
//
//      arrayList.stream().skip(2).forEach(System.out::println);


//
//      Stream<Employee> sorted = stream.sorted((e1, e2) -> Double.compare(e1.getId(), e2.getId()));
//      sorted.forEach(System.out::println);
//
//      System.out.println("***************************");
//
//      arrayList.stream().sorted((e1,e2)->Double.compare(e1.getId(),e2.getId())).forEach(System.out::println);


//      //打印员工姓名
//      Stream<String> stringStream = stream.map(employee -> employee.getName());
//      stringStream.forEach(System.out::println);
//      System.out.println("***************************");
//      arrayList.stream().map(t->t.getName()).forEach(System.out::println);

      //并行流
//      Stream<Employee> employeeStream = arrayList.parallelStream();
//      employeeStream.forEach(System.out::println);
//
//      System.out.println("***************************");
//
//      arrayList.parallelStream().forEach(System.out::println);
   }
   @Test
   public void test4(){
      //终止操作
      ArrayList<Employee> arrayList = new ArrayList<>();
      arrayList.add(new Employee(10000, "小明"));
      arrayList.add(new Employee(15000, "小李"));
      arrayList.add(new Employee(20000, "小红"));
      arrayList.add(new Employee(25000, "小刚"));
      //min
//      Optional<Employee> min = arrayList.stream().min((e1, e2) -> Double.compare(e1.getId(), e2.getId()));
//      System.out.println(min);
//      System.out.println(min.get());
//
//      System.out.println("***************************");
//
//      Optional<Employee> min1 = arrayList.stream().min((e1, e2) -> Double.compare(e1.getId(), e2.getId()));
//      System.out.println(min1);
//      System.out.println(min1.get());
      //max
//      Optional<Employee> min = arrayList.stream().max((e1, e2) -> Double.compare(e1.getId(), e2.getId()));
//      System.out.println(min);
//      System.out.println(min.get());
//
//      System.out.println("***************************");
//
//      Optional<Employee> min1 = arrayList.stream().max((e1, e2) -> Double.compare(e1.getId(), e2.getId()));
//      System.out.println(min1);
//      System.out.println(min1.get());
      //count
//      long count = arrayList.stream().count();
//      System.out.println(count);
//
//      System.out.println("***************************");
//
//      long count1 = arrayList.stream().count();
//      System.out.println(count1);
   }

   @Test
   public void test5() {
      //终止操作
      ArrayList<Employee> arrayList = new ArrayList<>();
      arrayList.add(new Employee(10000, "小明"));
      arrayList.add(new Employee(15000, "小李"));
      arrayList.add(new Employee(20000, "小红"));
      arrayList.add(new Employee(25000, "小刚"));

      //reduce 规约 可以把所有数据相加

      //计算所有员工工资和
//      Optional<Integer> reduce = arrayList.stream()
//              .map(e -> e.getId())//将员工工资映射成list表
//              .reduce((x, y) -> x + y);//相加操作
//      System.out.println(reduce.get());
//
//      System.out.println("***************************");
//
//      Optional<Integer> reduce1 = arrayList.stream().map(t -> t.getId()).reduce(Integer::sum);
//      System.out.println(reduce1);
//      System.out.println(reduce1.get());
      //collect
      List<String> collect = arrayList.stream()
              .map(e -> e.getName())
              .collect(Collectors.toList());
      for (String s:collect) {
         System.out.println(s);
      }
      System.out.println("***************************");
      List<String> collect1 = arrayList.stream().map(t -> t.getName()).collect(Collectors.toList());
      collect1.forEach(System.out::println);

   }
}
