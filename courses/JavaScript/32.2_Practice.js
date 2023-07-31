// Creating Your Own Objects

function main() {
    // take flight number and its status
    var flightNumber = readLine();
    var flightStatus = readLine();

    // assign a flight object to flight1 variable
    var flight1 = new Flight(flightNumber, flightStatus);

    // output
    console.log('The flight ' + flight1.number + ' is ' + flight1.status)
}

function Flight(flightNumber, status) {
    // fix the constructor
    this.number = flightNumber;
    this.status = status;
};