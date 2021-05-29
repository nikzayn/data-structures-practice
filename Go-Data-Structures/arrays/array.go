package main

import "fmt"

func main() {
	// fixed array
	a := [5]int{1, 2, 4, 5, 6}
	fmt.Printf("Length of array: %d", len(a))
	fmt.Println("\nCapacity of array:", cap(a))

	//dynamic array
	dynamic := make([]int, 5, 10)
	c := a[:2]
	fmt.Printf("Length and Capacity of array: %d %d", len(dynamic), cap(dynamic))
	fmt.Println("\nLength and Capacity of array:", c, len(c), cap(c))
}
