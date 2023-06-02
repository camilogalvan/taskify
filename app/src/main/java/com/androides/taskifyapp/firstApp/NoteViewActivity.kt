package com.androides.taskifyapp.firstApp

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androides.taskifyapp.R

class NoteViewActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var noteAdapter: NoteAdapter
    private lateinit var backButton: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_view)
        backButton = findViewById(R.id.back_button)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        noteAdapter = NoteAdapter()
        recyclerView.adapter = noteAdapter

        // Agregar elementos de prueba al adaptador
        noteAdapter.addItem("Desayunar")
        noteAdapter.addItemWithCheckbox("Hacer 30 minutos de ejercicio")
        noteAdapter.addItem("Estudiar programación")
        noteAdapter.addItemWithCheckbox("Seguir siendo hermoso")
        backButton.setOnClickListener {
            finish()
        }
    }

    private inner class NoteAdapter : RecyclerView.Adapter<NoteViewHolder>() {

        val items = ArrayList<String>()

        fun addItem(text: String) {
            items.add(text)
            notifyDataSetChanged()
        }

        fun addItemWithCheckbox(text: String) {
            items.add(text)
            notifyDataSetChanged()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val view = inflater.inflate(R.layout.item_note, parent, false)
            return NoteViewHolder(view)
        }

        override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
            val text = items[position]
            holder.bind(text)
        }

        override fun getItemCount(): Int {
            return items.size
        }
    }

    private inner class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: EditText = itemView.findViewById(R.id.text_view)
        private val checkBox: CheckBox = itemView.findViewById(R.id.checkbox)

        fun bind(text: String) {
            textView.setText(text)

            textView.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    (recyclerView.adapter as NoteAdapter).items[adapterPosition] = s.toString()
                }

                override fun afterTextChanged(s: Editable?) {
                }
            })
        }
    }



}
