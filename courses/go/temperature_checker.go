package main
import "fmt"

func main() {
	// your code goes here
	var input float32
	fmt.Sprintln(&input)

	if input <= 99.5 {
		fmt.Println("Allowed")
	} else {
		fmt.Println("Fever")
	}
}