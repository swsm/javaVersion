package org.example.text_blocks;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    /**
     * 文本块允许你编写多行字符串，而不需要使用+操作符或\n转义字符。
     */
    public static void main(String[] args) {
        String text = """
                {
                "name": "猫头虎Java",
                "age": 18,
                "address": "北京市西城区"
                }
            """;
        System.out.println(text);
    }
    
}
