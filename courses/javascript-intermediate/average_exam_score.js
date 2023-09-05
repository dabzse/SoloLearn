function main() {
    var exam1 = parseInt(readLine(), 10);
    var exam2 = parseInt(readLine(), 10);
    var exam3 = parseInt(readLine(), 10);

    console.log(Exams.average(exam1, exam2, exam3));

}
class Exams{
    // your code goes here
    static average(e1, e2, e3) {
        return Math.round((e1 + e2 + e3) / 3);
    }
}