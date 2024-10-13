package com.example.test

// List adalah kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan listOf
// List Mutable menggunakan mutableListOf

fun ContohList(){
    println("=== List ===")
    // List Read-Only
    val readOnlyAjab = listOf("A", "B", "C")
    println(readOnlyAjab)
}