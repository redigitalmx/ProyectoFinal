package mx.redigital.proyectofinal;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {

    private TextInputLayout tilNombre;
    private TextInputLayout tilTelefono;
    private TextInputLayout tilCorreo;
    private TextInputLayout tilDescripcion;

    private EditText etnombre;
    private EditText ettelefono;
    private EditText etcorreo;
    private EditText etdescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tilNombre = (TextInputLayout) findViewById(R.id.til_nombre);
        tilTelefono = (TextInputLayout) findViewById(R.id.til_telefono);
        tilCorreo = (TextInputLayout) findViewById(R.id.til_email);
        tilDescripcion = (TextInputLayout) findViewById(R.id.til_descripcion);


        etnombre = (EditText) findViewById(R.id.etNomCompleto);
        ettelefono = (EditText) findViewById(R.id.etTelefono);
        etcorreo = (EditText) findViewById(R.id.etEmail);
        etdescripcion = (EditText) findViewById(R.id.etDescripcion);
        //fpfnac = (DatePicker)  findViewById(R.id.dpFecNac);

        if (getIntent().getStringExtra("validar") != null) {
            recibirdatos();
        }

        etnombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                tilNombre.setError(null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        ettelefono.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                tilTelefono.setError(null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        etcorreo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                esCorreoValido(String.valueOf(s));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        Button botonSiguiente = (Button) findViewById(R.id.btnReg);
        botonSiguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                validarDatos();
            }

        });

    }

    private boolean esNombreValido(String nombre) {
        Pattern patron = Pattern.compile("^[a-zA-Z ]+$");
        if (!patron.matcher(nombre).matches() || nombre.length() > 30) {
            tilNombre.setError("Nombre inválido");
            return false;
        } else {
            tilNombre.setError(null);
        }

        return true;
    }

    private boolean esTelefonoValido(String telefono) {

        return true;
    }


    private boolean esCorreoValido(String correo) {

        return true;
    }


    private void validarDatos() {

        String nombre   = tilNombre.getEditText().getText().toString();
        String telefono = tilTelefono.getEditText().getText().toString();
        String correo   = tilCorreo.getEditText().getText().toString();

        boolean a = esNombreValido(nombre);
        boolean b = esTelefonoValido(telefono);
        boolean c = esCorreoValido(correo);

    }


    private void enviarDatos() {

        Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
        intent.putExtra("nombre", etnombre.getText().toString());
        intent.putExtra("telefono", ettelefono.getText().toString());
        intent.putExtra("correo", etcorreo.getText().toString());
        intent.putExtra("descripcion", etdescripcion.getText().toString());
        startActivity(intent);
        finish();

    }

    private void recibirdatos(){

        Bundle bundle = this.getIntent().getExtras();
        String nombre2 =



    }


    }
}
