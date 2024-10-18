package org.example.virtual_thread;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            System.out.println("Hello, www.didispace.com");
        };
        // 使用静态构建器方法
        Thread virtualThread = Thread.startVirtualThread(runnable);
        Thread.sleep(3000);
    }
    
}
