package es.fabricaweb.www.citas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    TextView txtNombre;
    TextView txtApellido;
    TextView txtDireccion;
    TextView txtCP;
    TextView txtCiudad;
    TextView txtProvincia;
    TextView txtTelefono;
    TextView txtCorreo;
    TextView txtClave;

    Button btnRegistrar;
    Button btnCancelar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtNombre = (TextView) findViewById(R.id.name);
        txtApellido = (TextView) findViewById(R.id.lastname);
        txtDireccion = (TextView) findViewById(R.id.address);
        txtCP = (TextView) findViewById(R.id.cp);
        txtCiudad = (TextView) findViewById(R.id.city);
        txtProvincia = (TextView) findViewById(R.id.state);
        txtTelefono = (TextView) findViewById(R.id.phone);
        txtCorreo = (TextView) findViewById(R.id.email);
        txtClave = (TextView) findViewById(R.id.password);

        btnCancelar = (Button) findViewById(R.id.btnCancel);
        btnRegistrar = (Button) findViewById(R.id.btnRegister);



        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();


            }
        });










    }
}