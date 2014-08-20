package ch.codecraft.playground.gradle;

import java.util.stream.Stream;

/**
 * Created by chris_000 on 2014-04-25.
 */
public class MyJavaMain {
    public static void main(String[] args) {
        System.out.println("java the main args=" + args);
        MyLib.doStuff();
        Stream.of("java", "the", "main").forEach(System.out::println);

        new MyJavaMain().dropToFrame();
    }

    private void dropToFrame() {
        int i = 0;
        i += 1;
        dropToFrame(i);
    }

    private void dropToFrame(int i) {
        i += 2;
    }
}
