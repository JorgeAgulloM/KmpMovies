package com.example.kmpmovies

data class Movies(
    val id: String,
    val title: String,
    val poster: String
) {
    companion object {
        val movies = (1..100).map {
            Movies(
                id = it.toString(),
                title = "Movie $it",
                poster = "https://picsum.photos/200/300?random=$it"
            )
        }
    }
}
