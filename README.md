# Frak Command Line Interface

Command line interface for [Frak](https://github.com/noprompt/frak).

## Why
Not all projects use Clojure. Also because.

## Usage

### Run the compiled JAR
You will need:
 * [Java](here)
~~~
git clone git@github.com:blainesch/frak-cli.git && cd frak-cli
java -jar ./compiled/frak-cli-0.1.0-standalone.jar arg1 arg2
arg[12]
~~~

### Using Leiningen
You will need:
 * [Java](here)
 * [Leiningen](here)
~~~
-> git clone git@github.com:blainesch/frak-cli.git && cd frak-cli
-> lein run arg1 arg2
arg[12]
~~~

## Examples

For better examples see [Frak](https://github.com/noprompt/frak).

### Alias
After picking your approach one I'd recomment making an alias.
~~~
# .bashrc / .zshrc
alias .regex="java -jar ~/frak-cli/compiled/frak-cli-0.1.0-standalone.jar"
# OR
function .regex() {
	cd ~/frak-cli
	lein run "$@"
	cd -
}
~~~
~~~
-> .regex arg1 arg2
arg[12]
~~~

## License

Distributed under the Eclipse Public License, the same as Clojure.
