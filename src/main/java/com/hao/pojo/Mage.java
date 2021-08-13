package com.hao.pojo;

import io.swagger.annotations.ApiModel;

/**
 * @ClassName Mage
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-07-15 09:08
 * @Copyright:
 **/
@ApiModel(value = "法师类")
public class Mage extends Professional {
    public void monster() {
        System.out.println("法师初始经验值为：" + this.getExperienceValue() + "物理值" + this.getPhysicalValues() + "防御值为：" + this.getDefenseValue() + "魔法值为:" + this.getMana() + "血条为：" + this.getArticleBlood() + "怒气值为：" + this.getAngerValue());
    }

    public void profess() {
        System.out.println("选择法师打怪兽");
    }
}
