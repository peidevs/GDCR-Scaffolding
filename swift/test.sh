#!/bin/bash

clear

if [ -f Sources/ConwayGameOfLife/main.swift ]; then
    mv Sources/ConwayGameOfLife/main.swift Sources/ConwayGameOfLife/main.swift.safe
fi

touch Sources/ConwayGameOfLife/*.swift

swift build

swift test

echo "Ready. $?"
