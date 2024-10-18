package org.example.sealed_class;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    public static void main(String[] args) {
        
    }

    /**
     * 密封类限制了哪些其他类可以继承它。
     * sealed: 限制哪些类可以继承当前类
     * non-sealed：对当前类的子类不再遵循父类的sealed标记的类
     */
    public sealed class Animal permits Dog, Cat {
    }
    public final class Dog extends Animal { }
    public non-sealed class Cat extends Animal { }
    
    public class People extends Cat {
        
    }
    
}
