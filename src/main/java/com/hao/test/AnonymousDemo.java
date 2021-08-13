package com.hao.test;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName AnonymousDemo
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-07-12 13:15
 * @Copyright:
 **/
public class AnonymousDemo {
    public void createClass() {

        // 创建的匿名类继承了 Polygon 类
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("在匿名类内部。");
            }
        };
        p1.display();

        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };

// 2.2使用 lambda expression
        Runnable race2 = () -> System.out.println("Hello world !");

// 直接调用 run 方法(没开新线程哦!)
        race1.run();
        race2.run();

        // 创建的匿名类继承了 Polygon 类
        Polygon1 p2 = () -> System.out.println("Hello world !");
        p2.display();


        String[] atp = {"阿斯蒂芬", "发生的方法",
                "阿斯蒂芬",
                "阿斯蒂芬", "山东干啥都",
                "阿斯蒂芬撒冻干粉", "阿斯顿发生",
                "阿斯顿发送到"};
        List<String> players = Arrays.asList(atp);

// 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }

        players.forEach((player) -> System.out.println(player + ";"));
        players.forEach(System.out::println);
    }
}
