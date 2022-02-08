package com.example.aesencryption

import com.example.encryption.callbacks.CallBack
import com.example.encryption.utility.Encryption

class Test {

    fun isEqual(a:Int,b:Int):Int{
        return a+b
    }

    fun validate(keyLength:Int,data:String,chum:String):String{
        var mResult :String = ""
        Encryption.encrypt(keyLength,data,chum,object : CallBack {
            override fun callback(result: Any) {
                mResult =  result.toString()
            }
        })
        return mResult
    }
    fun validateDecryption(keyLength:Int,data:String,chum:String):String{
        var mResult :String = ""
        Encryption.decrypt(keyLength,data,chum,object : CallBack {
            override fun callback(result: Any) {
                mResult =  result.toString()
            }
        })
        return mResult
    }

}