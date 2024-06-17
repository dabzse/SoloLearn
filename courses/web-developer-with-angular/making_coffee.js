let choice = parseInt(readLine(), 10);
/**
 * 1 => Americano
 * 2 => Espresso
 * 3 => Cappuccino
 */

// your code goes here
switch (choice) {
    case 1:
        console.log("Americano");
        break;
    case 2:
        console.log("Espresso");
        break;
    case 3:
        console.log("Cappuccino");
        break;
    default:
        console.log("Unknown");
}