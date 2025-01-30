package main
import "fmt"

func main() {
    team := map[string]float32 {
        "P1": 1.98,
        "P2": 2.05,
        "P3": 1.89,
        "P4": 2.0,
        "P5": 2.11,
    }

    var sum float32
    for _, height := range team {
        sum += height
    }

    avg := sum / float32(len(team))
    fmt.Printf("%.3f", avg)
}
