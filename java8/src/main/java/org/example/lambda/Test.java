package org.example.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    /**
     * lambda表达式牵涉到了如下概念：
     * <li>1. 函数式接口</li>
     * 函数式接口是一个只有一个抽象方法的接口。Java 8 提供了一些内置的函数式接口，比如 Runnable、Callable、Comparator 等，这些接口可以直接使用 Lambda 表达式。此外，开发者也可以自定义函数式接口。
     * <li>2. Lambda 语法</li>
     * Lambda 表达式提供了一种简洁的方式来实现函数式接口的实例。它的基本语法是：
     * <hr><blockquote><pre>
     * (parameters) -> expression
     * 或者
     * (parameters) -> { statements; }
     * </pre></blockquote><hr>
     * 其中 parameters 是参数列表，expression 是一个表达式，statements 是一个代码块。
     * <li>3.方法引用（Method References）</li>
     * 方法引用是一种使用 Lambda 表达式的便捷方式，它允许你直接引用已有的方法或构造函数。方法引用的语法是：
     * <hr><blockquote><pre>
     * ::new 
     * ClassName::staticMethod 
     * instance::instanceMethod 
     * Class::instanceMethod 
     * </pre></blockquote><hr>
     * <li>4.匿名内部类</li>
     * 在 Java 8 之前，要实现一个接口，通常需要创建一个匿名内部类。Lambda 表达式实际上是一种更简洁的匿名内部类。编译器会自动将 Lambda 表达式转换为匿名内部类的实现。
     * <li>5.Lambda 表达式的类型推断</li>
     * 当 Lambda 表达式被用在上下文中时，编译器会根据上下文推断出 Lambda 表达式的参数类型。如果参数只有一个，并且其类型可以被推断出来，那么可以省略参数类型和圆括号。
     *
     * <li>6.Lambda 表达式与 invokedynamic</li>
     * Java 7 引入了 invokedynamic 指令，它允许在运行时动态解析方法调用。Lambda 表达式就是通过 invokedynamic 实现的，这使得 Lambda 表达式可以非常高效地执行。
     *
     * <li>7.Lambda 表达式与 java.lang.invoke 包</li>
     * java.lang.invoke 包提供了一套 API，用于在运行时动态地创建和操作方法句柄。Lambda 表达式和方法引用的实现就依赖于这个包。
     * @param args
     */
    public static void main(String[] args) {
        // old
        List<String> strings = Arrays.asList("Java", "Lambda", "In", "Action");
        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));
        
        // lambda
        strings.sort((s1, s2) -> s1.compareTo(s2));
        
        // 再简化 
        strings.sort(String::compareTo);
    }
    
    
}
