package org.example.stream_to_list;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = Stream.of("a", "b", "c").toList();
        list.forEach(System.out::println);
    }
    
}
