package com.example.retrofitkotlin

import com.google.gson.annotations.SerializedName

class Data {

    // If you need any data for api you can access from here

    @SerializedName("results")
    var results: List<Results>? = null
    @SerializedName("total_pages")
    var total_pages: Int = 0
    @SerializedName("total_results")
    var total_results: Int = 0
    @SerializedName("page")
    var page: Int = 0
    @SerializedName("release_date")
    var release_date: String? = null
    @SerializedName("overview")
    var overview: String? = null
    @SerializedName("vote_average")
    var vote_average: Double = 0.toDouble()
    @SerializedName("title")
    var title: String? = null
    @SerializedName("genre_ids")
    var genre_ids: List<Int>? = null
    @SerializedName("original_title")
    var original_title: String? = null
    @SerializedName("original_language")
    var original_language: String? = null
    @SerializedName("backdrop_path")
    var backdrop_path: String? = null
    @SerializedName("adult")
    var adult: Boolean = false
    @SerializedName("id")
    var İd: Int = 0
    @SerializedName("poster_path")
    var poster_path: String? = null
    @SerializedName("video")
    var video: Boolean = false
    @SerializedName("vote_count")
    var vote_count: Int = 0
    @SerializedName("popularity")
    var popularity: Double = 0.toDouble()

    class Results {
        @SerializedName("release_date")
        var release_date: String? = null
        @SerializedName("overview")
        var overview: String? = null
        @SerializedName("vote_average")
        var vote_average: Double = 0.toDouble()
        @SerializedName("title")
        var title: String? = null
        @SerializedName("genre_ids")
        var genre_ids: List<Int>? = null
        @SerializedName("original_title")
        var original_title: String? = null
        @SerializedName("original_language")
        var original_language: String? = null
        @SerializedName("backdrop_path")
        var backdrop_path: String? = null
        @SerializedName("adult")
        var adult: Boolean = false
        @SerializedName("id")
        var İd: Int = 0
        @SerializedName("poster_path")
        var poster_path: String? = null
        @SerializedName("video")
        var video: Boolean = false
        @SerializedName("vote_count")
        var vote_count: Int = 0
        @SerializedName("popularity")
        var popularity: Double = 0.toDouble()
    }

    class Spoken_languages {
        @SerializedName("name")
        var name: String? = null
        @SerializedName("iso_639_1")
        var iso_639_1: String? = null
    }

    class Production_countries {
        @SerializedName("name")
        var name: String? = null
        @SerializedName("iso_3166_1")
        var iso_3166_1: String? = null
    }

    class Production_companies {
        @SerializedName("origin_country")
        var origin_country: String? = null
        @SerializedName("name")
        var name: String? = null
        @SerializedName("logo_path")
        var logo_path: String? = null
        @SerializedName("id")
        var id: Int = 0
    }

    class Genres {
        @SerializedName("name")
        var name: String? = null
        @SerializedName("id")
        var id: Int = 0
    }
}
