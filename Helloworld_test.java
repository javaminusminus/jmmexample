package github.com.javaminusminus.jmmexample;

import github.com.javaminusminus.simplebdd.Test;

public class Helloworld_test extends Test {

    public static void main(String[] args) {
        Helloworld_test test = new Helloworld_test();
        test.run();
    }

    public void testMsg() {
        this.should("return the congratulations text");
        this.assertEqual(Helloworld.msg(), "Congratulations on your first Java-- application.");
    }
}