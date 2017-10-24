
## Requirements

* install Docker
* in Docker window, `cd` to appropriate directory
* set `MY_SRC_HOME=$PWD`

<pre>
docker pull swiftdocker/swift

docker run --privileged -i -t --name swiftlife \
    -v $MY_SRC_HOME:/data swiftdocker/swift:latest /bin/bash

cd /data
</pre>

## To run tests

* in Docker window:
    * `docker start swiftlife` (if not already in container)
    * `docker attach swiftlife` (if not already in container)
    * `cd /data`
    * `swift test`

## To run main program

* in Docker window:
    * `docker start swiftlife` (if not already in container)
    * `docker attach swiftlife` (if not already in container)
    * `cd /data`
    * `swift build`
    * `./build/debug/ConwayGameOfLife`
