package mx.redigital.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.KeyEvent;

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

        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);

        //Aqui se declara el Boton de Editar
        Button botonEditDatos = (Button) findViewById(R.id.btEditarDatos);
        botonEditDatos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
               editardatos();

            }

        });

    }

    public boolean onKeyDown(int keyCode, KeyEvent envent) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            editardatos();
        }

        return super.onKeyDown(keyCode, envent);
    }


    private void editardatos(){
        Toast.makeText(this,"Enviando informacion para editar", Toast.LENGTH_LONG).show();
        Intent intent =new Intent(ConfirmarDatos.this,MainActivity.class);
        intent.putExtra("nombre2",tvNombre.getText().toString());
        intent.putExtra("telefono2",tvTelefono.getText().toString());
        intent.putExtra("correo2",tvEmail.getText().toString());
        intent.putExtra("descripcion2",tvDescripcion.getText().toString());
        intent.putExtra("validar","true");
        startActivity(intent);
        finish();
    }
}
