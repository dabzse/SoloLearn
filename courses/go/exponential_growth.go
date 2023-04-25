package main
import "fmt"

func main() {
    var years int
	fmt.Scanln(&years)
	// your code goes here
    rabbits := 7

	for i := 0; i < years; i++ {
		rabbits += rabbits
	}

	fmt.Println(rabbits)
}