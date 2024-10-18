package org.example.repeatable_annotation;

import java.lang.annotation.Repeatable;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {
    
    @interface FilterList {
        Filter[] value();
    }

    @Repeatable(FilterList.class)
    @interface Filter {
        String value();
    }
    
    @Filter("filter1")
    @Filter("filter2")
    public interface Filterable {
    }

    public static void main(String[] args) {
        
    }
    
}
