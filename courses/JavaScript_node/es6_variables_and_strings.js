function main() {
    var country = readLine();
    var capital = readLine();

    console.log(countryCard(country, capital));
}

function countryCard(country, capital) {
    // complete the function
    // use backtick (` `) for template literal
    const card = `Name: ${country}, Capital: ${capital}`
    return card
}