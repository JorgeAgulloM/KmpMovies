package com.example.kmpmovies

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform