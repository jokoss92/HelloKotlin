package id.ac.mercubuana.joko_ss.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageText.text = "Ini contoh gambar"
        image.setImageResource(R.mipmap.ic_launcher)

        val url = "https://www.w3schools.com/w3css/img_lights.jpg"
        Picasso.get()
            .load(url)
            .placeholder(R.drawable.images)
            .into(image)

    }
}
