package com.androides.taskifyapp.firstApp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.androides.taskifyapp.R

class HomeActivity : AppCompatActivity() {

    private lateinit var allListsButton: Button
    private lateinit var featuredButton: Button
    private lateinit var newListButton: Button
    private lateinit var demoNoteButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        allListsButton = findViewById(R.id.all_lists_button)
        featuredButton = findViewById(R.id.featured_button)
        newListButton = findViewById(R.id.new_list_button)
        demoNoteButton = findViewById(R.id.demo_note_button)


        allListsButton.setOnClickListener {
        }

        featuredButton.setOnClickListener {
        }

        newListButton.setOnClickListener {
            val intent = Intent(this, CreateNewListActivity::class.java)
            startActivity(intent)
        }

        demoNoteButton.setOnClickListener {
            val intent = Intent(this, NoteViewActivity::class.java)
            startActivity(intent)
        }

    }

}
