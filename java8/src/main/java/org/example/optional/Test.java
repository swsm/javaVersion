package org.example.optional;

import java.util.Optional;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {
    
    public static void main(String[] args) {
        // Optional 类用来避免 NullPointerException，可以包含或不包含非空值。例如：
        Optional<String> optional = Optional.of("Value");
        optional.ifPresent(System.out::println); // 输出 Value
    }
    
}
