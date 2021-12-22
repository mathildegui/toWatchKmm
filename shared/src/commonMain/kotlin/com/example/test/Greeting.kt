package com.example.test
// https://developers.themoviedb.org/3/getting-started/introduction
class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}