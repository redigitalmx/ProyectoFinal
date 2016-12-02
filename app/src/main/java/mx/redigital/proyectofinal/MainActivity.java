package mx.redigital.proyectofinal;



import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.DatePicker;


public class MainActivity extends AppCompatActivity {


   private EditText etNombre;

   //private EditText etFecha

   private EditText etTelefono;
   private EditText etEmail;
   private EditText etDescripcion;
   private DatePickerDialog datePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    public void findViewsByID(){
        etNombre = (EditText) findViewsByID(R.id.etNombre);
        etTelefono = (EditText) findViewById(R.id.etTelefono);
        etEmail= (EditText) findViewById(R.id.etEmail);
        etDescripcion= (EditText) findViewById(R.id.etEmail);




    }


    }
}
