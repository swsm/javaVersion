package org.example.record;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    /**
     * 记录是一种新的数据类型，用于表示不可变的数据。
     */
    public static void main(String[] args) {
        Point point = new Point(3, 4);
        System.out.println(point);
        System.out.println(point.x);
    }

    record Point(int x, int y) {
        
    }
    
    
}
