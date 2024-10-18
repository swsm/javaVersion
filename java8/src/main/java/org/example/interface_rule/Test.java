package org.example.interface_rule;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    /**
     * 接口可以拥有默认方法，即接口中可以有实现体的方法。
     * 
     * 实现接口的类可以覆盖默认方法，也可以直接使用默认实现。
     */
    interface Formula {
        default double sqrt(int a) {
            return Math.sqrt(a);
        }
    }
    
    public static void main(String[] args) {
        Formula formula = new Formula() {};
        System.out.println(formula.sqrt(100));
    }
    
}
