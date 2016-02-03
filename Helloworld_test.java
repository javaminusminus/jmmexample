//
// Copyright 2016, Yahoo Inc.
// Copyrights licensed under the New BSD License.
// See the accompanying LICENSE file for terms.
//

package github.com.jminusminus.jmmexample;

import github.com.jminusminus.simplebdd.Test;

public class Helloworld_test extends Test {

    public static void main(String[] args) {
        Helloworld_test test = new Helloworld_test();
        test.run();
    }

    public void testMsg() {
        this.should("return the congratulations text");
        this.assertEqual(Helloworld.msg(), "Congratulations on your first Jmm application.");
    }
}
