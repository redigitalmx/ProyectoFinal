package mx.redigital.proyectofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);


    Bundle bundle = getIntent().getExtras();

        String nombre       = bundle.getString("nombre");
        String telefono     = bundle.getString("telefono");
        String email        = bundle.getString("email");
        String descripcion  = bundle.getString("descripcion");

        tvNombre        = (TextView) findViewById(R.id.ddNombre);
        tvTelefono      = (TextView) findViewById(R.id.tvddTelefono);
        tvEmail         = (TextView) findViewById(R.id.tvddEmail);
        tvDescripcion   = (TextView) findViewById(R.id.tvddDescripcion);



    }
}
