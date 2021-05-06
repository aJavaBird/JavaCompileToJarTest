#!/bin/bash
#Author: zhc
#Date: 20210429

PROJECT_DIR=/home/apps/zhc/HuaxinLoginLinux/HuaxinLogin

cd $PROJECT_DIR
if [ ! -d bin ]; then
   mkdir bin
else
   rm -rf bin && mkdir bin
fi
find src/ -name *.java > src/source.list && javac -d bin @src/source.list
rm -rf src/source.list
echo "Compile finish,next is package"

if [ ! -d target ]; then
   mkdir target
fi

jar -cvf target/ghbLoginTest.jar -C bin/ .


