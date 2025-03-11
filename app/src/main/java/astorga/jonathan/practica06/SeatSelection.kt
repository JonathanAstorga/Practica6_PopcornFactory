package astorga.jonathan.practica06

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SeatSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_seat_selection)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val title: TextView = findViewById(R.id.txtTitleSeats)
        var psMovie = 1

        val bundle = intent.extras
        if (bundle!=null){
            title.setText(bundle.getString("name"))
            psMovie= bundle.getInt("id")
        }

        val confirm: Button = findViewById(R.id.btnConfirm)
        confirm.setOnClickListener{
            Toast.makeText(this, "Enjoy the movie! :D", Toast.LENGTH_LONG).show()
        }

        

    }
}