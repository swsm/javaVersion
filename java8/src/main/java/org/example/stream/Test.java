package org.example.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    /**
     * Stream API 提供了对集合对象进行一系列操作的新方式，包括筛选、转换、聚合等。例如，计算列表中所有数字的平方和：
     * 
     * Stream API 的设计哲学是将数据处理操作抽象化，使得代码更加简洁、易读，并且能够利用现代多核处理器的计算能力。通过链式调用和函数式编程，
     * Stream API 提供了一种强大而灵活的方式来处理集合数据。
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
    
}
