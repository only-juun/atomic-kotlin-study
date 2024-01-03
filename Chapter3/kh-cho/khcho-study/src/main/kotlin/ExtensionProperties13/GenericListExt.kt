package Chapter3.`kh-cho`.`khcho-study`.src.main.kotlin.ExtensionProperties13

import atomictest.eq

val <T> List<T>.firstOrNull: T?
    get() = if (isEmpty()) null else this[0]


fun main() {
    listOf(1, 2, 3).firstOrNull eq 1
    listOf<String>().firstOrNull eq null
}