package mx.edu.tesoem.isc.leco.proyectoleco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void chromium(View v){
        Intent chro = new Intent(this,chromium.class);
        startActivity(chro);
        finish();
    }
    public void clamav(View v) {
        Intent cla = new Intent(this, clamav.class);
        startActivity(cla);
        finish();
    }
    public void gimp(View v) {
        Intent gim = new Intent(this, gimp.class);
        startActivity(gim);
        finish();
    }
    public void mozilla(View v) {
        Intent moz = new Intent(this, mozilla.class);
        startActivity(moz);
        finish();
    }
   public void libreo(View v) {
       Intent lib = new Intent(this, libre.class);
       startActivity(lib);
       finish();
   }
    public void pdf(View v) {
        Intent pdf = new Intent(this, pdf.class);
        startActivity(pdf);
        finish();
    }
    public void open(View v) {
        Intent ope = new Intent(this, opensuse.class);
        startActivity(ope);
        finish();
    }
    public void cara(View v) {
        Intent car = new Intent(this, MainActivity.class);
        startActivity(car);
        finish();
    }
    public void acerca(View v) {
        Intent ace = new Intent(this, acercade.class);
        startActivity(ace);
        finish();
    }
}
