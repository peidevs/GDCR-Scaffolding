#!/bin/bash

clear

cp Sources/ConwayGameOfLife/main.swift.safe Sources/ConwayGameOfLife/main.swift

swift build

./.build/debug/ConwayGameOfLife

rm Sources/ConwayGameOfLife/main.swift

echo "Ready. $?"
