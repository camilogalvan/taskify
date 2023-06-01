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

        // Inicializar vistas
        backButton = findViewById(R.id.back_button)
        fixedToggle = findViewById(R.id.fixed_toggle)
        titleEditText = findViewById(R.id.title_edittext)
        addTaskButton = findViewById(R.id.add_task_button)
        taskInput = findViewById(R.id.task_input)
        personalButton = findViewById(R.id.personal_button)
        workButton = findViewById(R.id.work_button)
        shoppingButton = findViewById(R.id.shopping_button)
        otherButton = findViewById(R.id.other_button)

        // Configurar clic en el botón de regresar
        backButton.setOnClickListener {
            finish() // Finalizar la actividad y regresar a la anterior
        }

        // Configurar clic en el botón de agregar tarea
        addTaskButton.setOnClickListener {
            // Acciones para el botón "add_task_button"
            // Aquí puedes agregar el código que se ejecutará al hacer clic en el botón
            // Por ejemplo, puedes obtener el texto ingresado en el EditText de la tarea
            val taskText = taskInput.text.toString()

            // Realizar alguna acción con el texto de la tarea, como guardar en una lista, etc.

            // Limpiar el contenido del EditText de la tarea después de agregarla
            taskInput.text.clear()
        }


        // Configurar clic en los botones de etiqueta
        personalButton.setOnClickListener {
            // Realizar la acción correspondiente al seleccionar la etiqueta "Personal"
            // Aquí puedes implementar la lógica adicional que necesites
        }

        workButton.setOnClickListener {
            // Realizar la acción correspondiente al seleccionar la etiqueta "Trabajo"
            // Aquí puedes implementar la lógica adicional que necesites
        }

        shoppingButton.setOnClickListener {
            // Realizar la acción correspondiente al seleccionar la etiqueta "Compras"
            // Aquí puedes implementar la lógica adicional que necesites
        }

        otherButton.setOnClickListener {
            // Realizar la acción correspondiente al seleccionar la etiqueta "Otro"
            // Aquí puedes implementar la lógica adicional que necesites
        }
    }
}
