package org.example.pattern_match_switch;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {
    
    enum Fruit {
        Apple, Banana
    }

    /**
     * Java 17增强了switch表达式，支持模式匹配。
     */
    public static void main(String[] args) {
        Fruit fruit = Fruit.Apple;
        switch (fruit) {
            case Apple -> System.out.println("Apple");
            case Banana -> System.out.println("Banana");
            default -> System.out.println("Unknown fruit");
        }
    }
    
}
