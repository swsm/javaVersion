package org.example.string_ext;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    public static void main(String[] args) {
        String text = "   Hello, World!   ";
        if (text.isBlank()) {
            System.out.println("The string is blank.");
        }
        String trimmedText = text.strip();
        System.out.println(trimmedText);  // 输出: "Hello, World!"
        text.lines().forEach(System.out::println);
    }
    
}
