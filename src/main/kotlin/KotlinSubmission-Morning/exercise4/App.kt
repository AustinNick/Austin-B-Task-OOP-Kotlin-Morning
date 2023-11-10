package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    cobaTryCatchSuccess()
    cobaTryCatchFail()
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
fun cobaTryCatchSuccess() {
    println("Coba Try Catch Success:")
    try {
        val a = 10
        val b = 2
        val c = a / b
        println(c)
    } catch (e: Exception) {
        println("Terjadi error: ${e.message}")
    }
}

fun cobaTryCatchFail() {
    println("\nCoba Try Catch Fail:")
    try {
        val a = 10
        val b = 0
        val c = a / b
        println(c)
    } catch (e: Exception) {
        println("Terjadi error: ${e.message}")
    }
}