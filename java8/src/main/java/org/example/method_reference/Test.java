package org.example.method_reference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    public static void main(String[] args) {
        // 方法引用提供了一种快捷方式，直接引用已有方法或构造器。例如，使用方法引用来排序：
        List<String> strings = Arrays.asList("Java", "Lambda", "In", "Action");
        strings.sort(Comparator.comparing(String::toLowerCase));
        System.out.println(strings);
    }
    
}
