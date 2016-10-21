
## Requirements

* These instructions work for Mac OS X. Tweak as appropriate
* Install Docker from [here](https://www.docker.com/) 
* Open 'Docker Quick Start Terminal'
* Search online repository: `docker search golang`
* Pull the Mono image: `docker pull golang` 
* Confirm the new image: `docker images`
* set `MY_SRC_HOME` to be appropriate directory on your computer
* execute the following (one command at a time):

<pre>
cd $MY_SRC_HOME
docker run --rm -it -v $(pwd):/go golang
cd /go/src/life
</pre>

## To run tests

* `go test`

## To run main program

* `go install`
* `life`
