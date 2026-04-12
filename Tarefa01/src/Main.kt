//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var x = 4;
    var a =15
    var b = 2
    var y = 8

    while (a%b != 0){
        y+=1
        b = y+x
        a = a-1
    }
    println("y = $y")
}