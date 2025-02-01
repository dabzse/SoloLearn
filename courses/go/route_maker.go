package main
import "fmt"

// create the route() function
func route(cities ...string) {
    for i, city := range cities {
        fmt.Print(city)
        if i < len(cities) - 1 {
            fmt.Print("->")
        }
    }
    fmt.Println("->")
}

func main() {
    var n int
    fmt.Scanln(&n)

    var cities []string
    // take n strings as input and append them to the slice
    for i := 0; i < n; i++ {
        var city string
        fmt.Scanln(&city)
        cities = append(cities, city)
    }
    //
    route(cities...)
}
