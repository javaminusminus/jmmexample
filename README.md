
# Helloworld
#### Package: github.com.jminusminus.jmmexample
[![Build Status](https://travis-ci.org/jminusminus/jmmexample.svg?branch=master)](https://travis-ci.org/jminusminus/jmmexample)
## Stability: 1 - Stable
This is an example project for [Jmm](https://github.com/ricallinson/jmm).

## Install
```
jmm get github.com/jminusminus/jmmexample
```
The following jmm commands will setup up a Jmm workspace, pull down the code for this project, test it, install it and then run it.
    mkdir ./jmmtest
    cd ./jmmtest
    jmm here .
    jmm get github.com/jminusminus/simplebdd
    jmm get github.com/jminusminus/jmmexample
    jmm test ./src/github/com/jminusminus/jmmexample
    jmm install ./src/github/com/jminusminus/jmmexample
    jmmexample

## github.com.jminusminus.jmmexample.Helloworld
```
import github.com.jminusminus.jmmexample.Helloworld;
```
## static String msg()
Return a congratulations message.

