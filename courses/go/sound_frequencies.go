package main
import "fmt"

func main() {
    var f int
    fmt.Scanln(&f)
    // your code goes here
    switch {
        case f < 0:
            fmt.Println("Wrong Input")
        case f < 20:
            fmt.Println("Infrasound")
        case f > 20_000:
            fmt.Println("Ultrasound")
    default:
        fmt.Println("Audible")
    }
}
