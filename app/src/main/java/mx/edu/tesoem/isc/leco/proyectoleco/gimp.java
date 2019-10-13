package mx.edu.tesoem.isc.leco.proyectoleco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gimp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gimp);
    }
    public void botonMenu(View v){
        Intent menu = new Intent(this, mx.edu.tesoem.isc.leco.proyectoleco.menu.class);
        startActivity(menu);
        finish();
    }
}
