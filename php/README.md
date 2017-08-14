
### Info

* uses [this](https://hub.docker.com/r/phpunit/phpunit/) Docker image
    * as of AUG 2017, uses PHPUnit 6.0.x and PHP 7.0

### Setup

* install Docker
* in Docker window, `cd` to appropriate directory

<pre>
docker pull phpunit/phpunit
chmod 744 ./run_tests.sh
</pre>

### To run tests

* `./run_tests.sh`
