//package HigherOrderFunctions

import atomictest.eq


fun main() {
    val returnTypeNullable: (String) -> Int? = { null }
    val mightBeNull: ((String) -> Int)? = null
    returnTypeNullable("abc") eq null

    if (mightBeNull != null) {
        mightBeNull("abc")
    }

}