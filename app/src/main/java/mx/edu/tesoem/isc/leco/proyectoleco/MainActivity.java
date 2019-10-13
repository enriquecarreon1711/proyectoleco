package mx.edu.tesoem.isc.leco.proyectoleco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent kik=new Intent(MainActivity.this,menu.class);
                startActivity(kik);
                finish();
            }
        },3000);
    }
   public void botonMenu(View v){
       Intent menu = new Intent(this, mx.edu.tesoem.isc.leco.proyectoleco.menu.class);
       startActivity(menu);
       finish();
    }



}
