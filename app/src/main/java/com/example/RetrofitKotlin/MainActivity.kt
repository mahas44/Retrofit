package com.example.RetrofitKotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    val API_KEY = "api_key"
    var result: Data? = null
    var resultPopular: List<Data.Results>? = null
    var myAdapter: RecylerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var apiInterface = ApiClient.client?.create(ApiInterface::class.java)

        var apiCall = apiInterface?.getAllPlaylist(API_KEY)

        apiCall?.enqueue(object : Callback<Data>{

            override fun onResponse(call: Call<Data>?, response: Response<Data>?) {
                result = response?.body()
                resultPopular = result?.results

                var layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
                rvList.layoutManager = layoutManager
                supportActionBar?.setSubtitle("Total Movie : " + resultPopular?.size)
                myAdapter = RecylerAdapter(resultPopular)
                rvList.adapter = myAdapter

            }

            override fun onFailure(call: Call<Data>?, t: Throwable?) {
                Log.e("Error", ""+t?.printStackTrace())
            }
        })




    }
}
