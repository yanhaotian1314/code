package com.hao.pojo;

import java.util.Scanner;

/**
 * @ClassName test
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-07-15 09:33
 * @Copyright:
 **/
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择职业1.战士2.法师");
        int i = scanner.nextInt();
        Integer articleBlood = 300;
        Integer experienceValue = 1000;
        Integer physicalValues = 50;
        switch (i) {
            case 1:
                Professional professional = new Warrior();
                professional.setExperienceValue(100);
                professional.setPhysicalValues(100);
                professional.setArticleBlood(500);
                professional.monster();
                professional.profess();
                moster(scanner, professional, articleBlood, experienceValue, physicalValues);
                break;
            case 2:
                Professional professional1 = new Mage();
                professional1.monster();
                professional1.profess();
                moster(scanner, professional1, articleBlood, experienceValue, physicalValues);
                break;
        }
    }

    private static void moster(Scanner scanner, Professional professional, Integer articleBlood, Integer experienceValue, Integer physicalValues) {
        for (int x = 0; x < 10; x++) {
            boolean flag = true;
            System.out.println("是否进入第" + (x + 1) + "关？1.是2.否");
            int j = scanner.nextInt();
            if (j == 1) {
                Monster monster = new Monster();
                monster.setExperienceValue(experienceValue * (x + 1));
                monster.setPhysicalValues(physicalValues * (x + 1));
                monster.setArticleBlood(articleBlood * (x + 1));
                monster.monster();
                System.out.println("打怪兽中............");
                Integer setPhysicalValues = professional.getPhysicalValues();
                Integer physica = monster.getPhysicalValues();
                Integer blood = professional.getArticleBlood();
                Integer bloods = monster.getArticleBlood();
                while (flag) {
                    int re = (int) (Math.random() * physica);
                    int res = (int) (Math.random() * setPhysicalValues);
                    blood -= re;
                    bloods -= res;
                    //攻击后的敌人剩余血量
                    System.out.println("怪兽的剩余血量为" + bloods);
                    System.out.println("你的血量为" + blood);
                    professional.setArticleBlood(blood);
                    monster.setArticleBlood(bloods);
                    //有一方血量为负时攻击游戏结束
                    if (bloods < 0) {
                        System.out.println("随着你的攻击,怪兽被打死了，哈哈哈！！！");
                        flag = true;
                        break;
                    } else if (blood < 0) {
                        System.out.println("闯关失败！！！");
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                }
            } else {
                System.out.println("已退出！");
                break;
            }
        }
    }
}
