package org.example.sequence_arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    /**
     * 在JDK 21之后，访问第一个和最后一个元素就方法多了：
     *
     * 对于List, Deque, Set这些有序的集合，访问方法变得统一起来：
     * 第一个元素：collection.getFirst()
     * 最后一个元素：collection.getLast()
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
    
}
