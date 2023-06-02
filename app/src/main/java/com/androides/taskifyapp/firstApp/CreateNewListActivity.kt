package com.androides.taskifyapp.firstApp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import com.androides.taskifyapp.R

class CreateNewListActivity : AppCompatActivity() {

    private lateinit var backButton: ImageButton
    private lateinit var fixedToggle: ToggleButton
    private lateinit var titleEditText: EditText
    private lateinit var addTaskButton: ImageButton
    private lateinit var taskInput: EditText
    private lateinit var personalButton: Button
    private lateinit var workButton: Button
    private lateinit var shoppingButton: Button
    private lateinit var otherButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_list)

        backButton = findViewById(R.id.back_button)
        fixedToggle = findViewById(R.id.fixed_toggle)
        titleEditText = findViewById(R.id.title_edittext)
        addTaskButton = findViewById(R.id.add_task_button)
        taskInput = findViewById(R.id.task_input)
        personalButton = findViewById(R.id.personal_button)
        workButton = findViewById(R.id.work_button)
        shoppingButton = findViewById(R.id.shopping_button)
        otherButton = findViewById(R.id.other_button)

        backButton.setOnClickListener {
            finish()
        }

        addTaskButton.setOnClickListener {
            val taskText = taskInput.text.toString()
            taskInput.text.clear()
        }


        personalButton.setOnClickListener {

        }

        workButton.setOnClickListener {
        }

        shoppingButton.setOnClickListener {
        }

        otherButton.setOnClickListener {
        }
    }
}
