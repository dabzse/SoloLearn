package main
import "fmt"

type Cart struct {
    prices []float32
}

func (x Cart) show() {
    var sum float32 = 0.0
    for _, price := range x.prices {
        sum += price
    }
    fmt.Println(sum)
}

func main() {
    var n int
    fmt.Scanln(&n)

    c := Cart{prices: make([]float32, n)}
    for i := 0; i < n; i++ {
        fmt.Scanln(&c.prices[i])
    }

    c.show()
}
