# Java-- Example Application

[![Build Status](https://travis-ci.org/javaminusminus/jmmexample.svg?branch=master)](https://travis-ci.org/javaminusminus/jmmexample)

This is an example project for [Java--](https://github.com/ricallinson/jmm). The following jmm commands will setup up a Java-- workspace, pull down the code for this project, test it, install it and thgen run it.

	mkdir ./jmmtest
	cd ./jmmtest
	jmm here .
	jmm get github.com/javaminusminus/simplebdd
	jmm get github.com/javaminusminus/jmmexample
	jmm test ./src/github/com/javaminusminus/jmmexample
	jmm install ./src/github/com/javaminusminus/jmmexample
	jmmexample
