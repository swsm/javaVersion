package org.example.enhanced_pseudo_random_number_gen;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    /**
     * Java 17提供了新的伪随机数生成器接口。
     */
    public static void main(String[] args) {
        RandomGeneratorFactory<RandomGenerator> l128X256MixRandom = RandomGeneratorFactory.of("L128X256MixRandom");
        RandomGenerator randomGenerator = l128X256MixRandom.create(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            System.out.println(randomGenerator.nextInt());
        }
        
    }
    
}
