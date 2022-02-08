package com.example.aesencryption

import junit.framework.Assert
import junit.framework.Assert.assertEquals
import junit.framework.TestCase
import org.junit.Test

class Testing {

    val chum = "ABCDEFGHIJKLMNOT"
    val chum192 = "ABCDEFGHIJKLMNOTWERTYUIO"
    val chum256 = "ABCDEFGHIJKLMNOTABCDEFGHIJKLMNOT"
    val data = "Aqib Javed"

    val test = com.example.aesencryption.Test()
    @Test
    fun compare(){
        val result = test.isEqual(3,4)
        assertEquals(7, result)
    }

    @Test
    fun valid(){
        val result = test.validate(16,data,chum)
        assertEquals("/Q8fgbxPIABOtY0zcMA0fg==", result)
        val decrypt = test.validateDecryption(16,result,chum)
        assertEquals("Aqib Javed", decrypt)
    }
    @Test
    fun valid1(){
        val result = test.validate(24,data,chum192)
        assertEquals("K/f26toOjEKYfAkP4KC2KA==", result)
        val decrypt = test.validateDecryption(24,result,chum192)
        assertEquals("Aqib Javed", decrypt)
    }
    @Test
    fun valid2(){
        val result = test.validate(32,data,chum256)
        assertEquals("ifvoRnCHlDH6XCzc4TNAvw==", result)
        val decrypt = test.validateDecryption(32,result,chum256)
        assertEquals("Aqib Javed", decrypt)
    }

}