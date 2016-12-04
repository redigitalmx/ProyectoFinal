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

   //private EditText etFecha

   private EditText etTelefono;
   private EditText etEmail;
   private EditText etDescripcion;

   private DatePickerDialog datePickerDialog;

   private String tvNombre;
   private String tvTelefono;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText field = (EditText)findViewById(R.id.etNombre);
    }


    }

