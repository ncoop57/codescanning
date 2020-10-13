#!/bin/bash

echo "DES_REPLACE"

./clean.sh

javac CipherExample.java
jar cvfe example.jar CipherExample CipherExample.class

rm -rf *.class
