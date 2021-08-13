package com.hao.test;

import org.springframework.util.ObjectUtils;

import java.text.Collator;
import java.util.*;

/**
 * @ClassName test
 * @description: TODO(描述这个类的作用)
 * @author: yanhaotian
 * @date: 2021-07-12 13:15
 * @Copyright:
 **/
public class test {
    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> m = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            m.put("staffId", "阿斯蒂芬");
            list.add(m);
        }
        for (int i = 0; i < 3; i++) {
            m.put("staffId", "按时");
            list.add(m);
        }
        Comparator<Map<String, Object>> comparator = (o1, o2) -> Collator.getInstance(Locale.CHINA).compare(o1.get("staffId"), o2.get("staffId"));
        Collections.sort(list, comparator);
        for (Map<String, Object> i : list) {
            System.out.print(i + "  ");
        }

    }
}
