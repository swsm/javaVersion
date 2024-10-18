package org.example.help_null_pointer;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    /**
     * Java 17中的NullPointerExceptions提供了更详细的错误信息。
     */
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length());
    }
    
}
