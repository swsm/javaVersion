package org.example.var;

import java.util.ArrayList;
import java.util.List;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    /**
     * Java 11 引入了本地变量类型推断，这意味着我们可以使用 var 关键字来声明变量，
     * 编译器会根据上下文自动推断变量类型
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        for (int i = 0; i < list.size(); i++) {
            var a = list.get(i);
            System.out.println(a);
        }

        var list2 = new ArrayList<String>();
        list2.add("Java");
        list2.add("Python");
        list2.forEach(System.out::println);
    }
    
}
