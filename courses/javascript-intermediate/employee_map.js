function main() {
    var name = readLine();
    var position = readLine();

    let employees = new Map([
        ["Richard", "Developer"],
        ["Maria", "SEO Specialist"],
        ["Tom", "Product Manager"],
        ["David", "Accountant"],
        ["Sophia", "HR Manager"]
    ]);

    // add the new pair to the map
    employees.set(name, position);

    for (var employee of employees.entries()) {
        // your code for the output
        console.log(employee[0] + " : " + employee[1]);
    }
}