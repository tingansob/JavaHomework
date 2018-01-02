package main

import (
	"fmt"
	"math"
	"math/rand"
	"time"
)

func main() {
	fmt.Println("Greetings, fellow gopher")
	fmt.Println("The time is ", time.Now())
	fmt.Println()
	fmt.Println("My favorite number is", rand.Intn(10))
	fmt.Println(math.Pi)
	fmt.Println(add(23, 77))
	a, b := swap("hello", "world")
	fmt.Println(a, b)
}

func add(x int, y int) int {
	return x + y
}

func swap(x, y string) (string, string) {
	return y, x
}
