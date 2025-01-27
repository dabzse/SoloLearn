package main
import "fmt"

func main() {
    menu := [6]string{"Water", "Burger", "Cake", "Soup", "Soda", "Fries"}

    var choice int
    fmt.Scanln(&choice)

    if choice < 0 || choice >= len(menu) {
        fmt.Println("Invalid choice")
        return
    }

    fmt.Println(menu[choice])
}
