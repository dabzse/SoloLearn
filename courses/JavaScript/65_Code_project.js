// Words

class Add {
    constructor(... words) {
        this.words = words;
}

    // your code goes here
    print() {
        var w = this.words.join("$");
        console.log("$"+w+"$")
    }
}

var x = new Add("hehe", "hoho", "haha", "hihi", "huhu");
var y = new Add("this", "is", "awesome");
var z = new Add("lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit");
x.print();
y.print();
z.print();