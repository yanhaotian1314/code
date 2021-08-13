package com.hao.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName Professional
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-07-15 09:08
 * @Copyright:
 **/
@ApiModel(value = "职业类")
public class Professional {
    @ApiModelProperty(value = "等级")
    private Integer level;
    @ApiModelProperty(value = "经验值")
    private Integer experienceValue;
    @ApiModelProperty(value = "物理值")
    private Integer physicalValues;
    @ApiModelProperty(value = "防御值")
    private Integer defenseValue;
    @ApiModelProperty(value = "魔法值")
    private Integer mana;
    @ApiModelProperty(value = "血条")
    private Integer articleBlood;
    @ApiModelProperty(value = "怒气值")
    private Integer angerValue;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getExperienceValue() {
        return experienceValue;
    }

    public void setExperienceValue(Integer experienceValue) {
        this.experienceValue = experienceValue;
    }

    public Integer getPhysicalValues() {
        return physicalValues;
    }

    public void setPhysicalValues(Integer physicalValues) {
        this.physicalValues = physicalValues;
    }

    public Integer getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(Integer defenseValue) {
        this.defenseValue = defenseValue;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getArticleBlood() {
        return articleBlood;
    }

    public void setArticleBlood(Integer articleBlood) {
        this.articleBlood = articleBlood;
    }

    public Integer getAngerValue() {
        return angerValue;
    }

    public void setAngerValue(Integer angerValue) {
        this.angerValue = angerValue;
    }

    public Professional() {
    }

    public void monster() {
        System.out.println("当前等级为：" + this.getLevel() + "经验值为：" + this.getExperienceValue() + "物理值" + this.getPhysicalValues() + "防御值为：" + this.getDefenseValue() + "魔法值为:" + this.getMana() + "血条为：" + this.getArticleBlood() + "怒气值为：" + this.getAngerValue());
    }

    public void profess() {
        System.out.println("打怪兽");
    }
}
