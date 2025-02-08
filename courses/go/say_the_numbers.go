package main
import "fmt"

func swfunc(o int) {
    switch o {
        case 1: fmt.Println("One")
            break
        case 2: fmt.Println("Two")
            break
        case 3: fmt.Println("Three")
            break
        case 4: fmt.Println("Four")
            break
        case 5: fmt.Println("Five")
            break
        case 6: fmt.Println("Six")
            break
        case 7: fmt.Println("Seven")
            break
        case 8: fmt.Println("Eight")
            break
        case 9: fmt.Println("Nine")
            break
        case 10: fmt.Println("Ten")
            break
    default: fmt.Println("Zero")
    }
}

func main() {
    // your code goes here
    var i, m, n int
    fmt.Scanln(&i)
    fmt.Scanln(&m)
    fmt.Scanln(&n)
    swfunc(i)
    swfunc(m)
    swfunc(n)
}
