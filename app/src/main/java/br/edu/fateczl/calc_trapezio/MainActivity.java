package br.edu.fateczl.calc_trapezio;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText etbaseMaior;
    private EditText etbaseMenor;
    private EditText etAltura;
    private TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etbaseMaior=findViewById(R.id.etBaseMaior);
        etbaseMaior.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        etbaseMenor=findViewById(R.id.etBaseMenor);
        etbaseMenor.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        etAltura=findViewById(R.id.etAltura);
        etAltura.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        tvRes=findViewById(R.id.tvRes);
        tvRes.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        Button btnCalc=findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(op -> calc());

    }

    private void calc(){

        int baseMaior=Integer.parseInt(etbaseMaior.getText().toString());
        int baseMenor=Integer.parseInt(etbaseMenor.getText().toString());
        int altura=Integer.parseInt(etAltura.getText().toString());

        int area=((baseMaior+baseMenor)*altura)/2;

        String res=getString(R.string.area)+"= "+area;

        tvRes.setText(res);

    }

}