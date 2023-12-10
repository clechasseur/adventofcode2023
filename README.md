# adventofcode.y2023

My solutions to the Advent of Code 2023 puzzles. Using Clojure this year because of course. 😉

## Requirements

1. [JDK](https://adoptium.net/)
2. [Clojure](https://clojure.org/)
3. [Leiningen](https://leiningen.org/)

## Running the tests

### All puzzles for each day

```sh
lein test
```

### Both puzzles for one day

```sh
lein test :only adventofcode.test.y2023.d1
```

### Single puzzle

```sh
lein test :only adventofcode.test.y2023.d1/part1
```

### Utilities

```sh
lein test :util
```

### Everything

```sh
lein test :all
```
