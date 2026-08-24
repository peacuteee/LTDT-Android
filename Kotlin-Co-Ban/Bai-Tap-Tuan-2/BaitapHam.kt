fun sayhello() {
    println("xin chao, toi là ThanhTai, toi thuoc khoa CNS")
}
fun add(a: Int, b: Int): Int {
    return a + b
}
fun calculateAverage(a: Double, b: Double): Double {
    return (a + b) / 2.0
}
fun main() {  
    sayhello()
    
    print("Nhap a: ")
    val numA = readln().toInt()
    print("Nhap b: ")
    val numB = readln().toInt()
    val sum = add(numA, numB)
    println("Tong la: $sum")
    
    print("Nhap a (db) ")
    val doubleA = readln().toDouble()
    print("Nhap b (db) ")
    val doubleB = readln().toDouble()
    
    val average = calculateAverage(doubleA, doubleB)
    println("Gia tri trung binh: $average")
}
