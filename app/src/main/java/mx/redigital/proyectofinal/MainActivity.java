package mx.redigital.proyectofinal;



import android.app.DatePickerDialog;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.DatePicker;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


   private EditText name;
   private EditText bdate;
   private EditText bphone;
   private EditText email;
   private EditText description;

   private DatePickerDialog datePickerDialog;

   private String tvNombre;
   private String tvFecha;
   private String tvTelefono;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nombre       = (EditText)findViewById(R.id.etNombre);
        EditText fecha        = (EditText)findViewById(R.id.etFecha);
        EditText telefono     = (EditText)findViewById(R.id.etTelefono);
        EditText email        = (EditText)findViewById(R.id.etEmail);
        EditText descripcion  = (EditText)findViewById(R.id.etDescripcion);


    }
}

