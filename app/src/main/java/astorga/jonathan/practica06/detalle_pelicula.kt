package astorga.jonathan.practica06

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detalle_pelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle_pelicula)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imgPelicula: ImageView = findViewById(R.id.imgPeliculaImagen)
        val txtNombrePelicula: TextView = findViewById(R.id.txtPeliculaDesc)
        val txtDescPelicula: TextView = findViewById(R.id.txtPeliculaDesc)

        val bundle = intent.extras
        if (bundle != null){
            imgPelicula.setImageResource(bundle.getInt("header"))
            txtNombrePelicula.setText(bundle.getString("titulo"))
            txtDescPelicula.setText(bundle.getString("sinopsis"))
        }
    }
}