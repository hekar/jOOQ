#!/bin/sh

ECLIPSE_DIR=/home/hekar/bin/ramdisk/ejava

# Copy Eclipse jars to the Maven dependencies folder
mvn eclipse:to-maven -DstripQualifier=true -DeclipseDir=$ECLIPSE_DIR

