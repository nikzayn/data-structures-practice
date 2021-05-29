package main

import "fmt"

func largestElementInArray(arr []int) int {
	largest := 0
	for i := 0; i < len(arr); i++ {
		if arr[i] > largest {
			largest = arr[i]
		}
	}
	return largest
}

func main() {
	arr := []int{4, 7, 2, 9, 3}
	fmt.Println(largestElementInArray(arr))
}
