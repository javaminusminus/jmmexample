//
// Copyright 2016, Yahoo Inc.
// Copyrights licensed under the New BSD License.
// See the accompanying LICENSE file for terms.
//

// [![Build Status](https://travis-ci.org/jminusminus/jmmexample.svg?branch=master)](https://travis-ci.org/jminusminus/jmmexample)
// ## Stability: 1 - Stable
// This is an example project for [Jmm](https://github.com/ricallinson/jmm).
package github.com.jminusminus.jmmexample;

public class Helloworld {

    // The following jmm commands will setup up a Jmm workspace, pull down the code for this project, test it, install it and then run it.
    //
    //     mkdir ./jmmtest
    //     cd ./jmmtest
    //     jmm here .
    //     jmm get github.com/jminusminus/simplebdd
    //     jmm get github.com/jminusminus/jmmexample
    //     jmm test ./src/github/com/jminusminus/jmmexample
    //     jmm install ./src/github/com/jminusminus/jmmexample
    //     jmmexample
    public static void main(String args[]) {
        System.out.println(Helloworld.msg());
    }

    // Return a congratulations message.
    public static String msg() {
        return "Congratulations on your first Jmm application.";
    }
}
