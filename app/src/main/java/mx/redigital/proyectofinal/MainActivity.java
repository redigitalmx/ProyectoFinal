package mx.redigital.proyectofinal;



import android.app.DatePickerDialog;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.DatePicker;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


   private EditText etNombre;
   private EditText etFecha;
   private EditText etTelefono;
   private EditText etEmail;
   private EditText etDescripcion;

   private DatePickerDialog datePickerDialog;

   private String tvNombre;
   private String tvFecha;
   private String tvTelefono;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText tvnombre       = (EditText)findViewById(R.id.etNombre);
        EditText tvfecha        = (EditText)findViewById(R.id.etFecha);
        EditText tvtelefono     = (EditText)findViewById(R.id.etTelefono);
        EditText tvemail        = (EditText)findViewById(R.id.etEmail);
        EditText tvdescripcion  = (EditText)findViewById(R.id.etDescripcion);


    }
}

