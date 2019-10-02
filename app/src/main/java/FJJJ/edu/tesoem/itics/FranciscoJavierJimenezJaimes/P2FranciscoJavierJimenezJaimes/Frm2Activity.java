package FJJJ.edu.tesoem.itics.FranciscoJavierJimenezJaimes.P2FranciscoJavierJimenezJaimes;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Frm2Activity extends AppCompatActivity  {
    TextView btnsig2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);

    }
    //Método botón siguiente
    public void sig2 (View view){
        Intent sig2 = new Intent(this,Frm3Activity.class
        );
        startActivity(sig2);


    }
}
