package com.example.currtal

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.AdapterView.OnItemClickListener
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity1 : AppCompatActivity() {


    var listView: ListView? = null
    var mTitle =
        arrayOf("Facebook", "Whatsapp", "Twitter", "Instagram", "Youtube")
    var mDescription = arrayOf(
        "Facebook Description",
        "Whatsapp Description",
        "Twitter Description",
        "Instagram Description",
        "Youtube Description"
    )
    var images = intArrayOf(
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background
    )

    // so our images and other things are set in array
    // now paste some images in drawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        // now create an adapter class
        val adapter = MyAdapter(this, mTitle, mDescription, images)
        listView!!.adapter = adapter
        // there is my mistake...
        // now again check this..

        // now set item click on list view
        listView!!.onItemClickListener = OnItemClickListener { _, _, position, _ ->
            if (position == 0) {
                Toast.makeText(this, "Facebook Description", Toast.LENGTH_SHORT)
                    .show()
            }
            if (position == 0) {
                Toast.makeText(this, "Whatsapp Description", Toast.LENGTH_SHORT)
                    .show()
            }
            if (position == 0) {
                Toast.makeText(this, "Twitter Description", Toast.LENGTH_SHORT)
                    .show()
            }
            if (position == 0) {
                Toast.makeText(this, "Instagram Description", Toast.LENGTH_SHORT)
                    .show()
            }
            if (position == 0) {
                Toast.makeText(this, "Youtube Description", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        // so item click is done now check list view
    }

    internal inner class MyAdapter(
        contxt: Context,
        private var rTitle: Array<String>,
        private var rDescription: Array<String>,
        private var rImgs: IntArray
    ) : ArrayAdapter<String?>(contxt, R.layout.row, R.id.textView1, rTitle) {
        @NonNull
        override fun getView(
            position: Int,
            @Nullable convertView: View?,
            @NonNull parent: ViewGroup
        ): View {
            val layoutInflater =
                applicationContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val row: View = layoutInflater.inflate(R.layout.row, parent, false)
            val images =
                row.findViewById<ImageView>(R.id.image)
            val myTitle = row.findViewById<TextView>(R.id.textView1)
            val myDescription = row.findViewById<TextView>(R.id.textView2)

            // now set our resources on views
            images.setImageResource(rImgs[position])
            myTitle.text = rTitle[position]
            myDescription.text = rDescription[position]
            return row
        }

    }
}