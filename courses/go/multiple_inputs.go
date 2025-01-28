package main
import "fmt"

func main() {
    var n int
    fmt.Scanln(&n)

    // your code goes here
    numbers := make([]int, 0, n)

    for i := 0; i < n; i++ {
        var num int
        fmt.Scanln(&num)
        numbers = append(numbers, num)
    }

    fmt.Println(numbers)
}
