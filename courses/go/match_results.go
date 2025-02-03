package main
import "fmt"

func main() {
    results := []string { "w", "l", "w", "d", "w", "l", "l", "l", "d", "d", "w", "l", "w", "d" }
    var lastResult string
    fmt.Scanln(&lastResult)
    results = append(results, lastResult)
    var points int
    for _, result := range results {
        switch result {
            case "w":
                points += 3
            case "d":
                points += 1
        }
    }
    fmt.Println(points)
}
