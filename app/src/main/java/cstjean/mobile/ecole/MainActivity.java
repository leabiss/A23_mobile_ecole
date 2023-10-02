package cstjean.mobile.ecole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnSuivant;
    private ImageButton btnPrecedent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrecedent = findViewById(R.id.btn_precedent);
        btnSuivant = findViewById(R.id.btn_suivant);

        btnPrecedent.setOnClickListener(view -> Toast.makeText(MainActivity.this, R.string.btn_precedent, Toast.LENGTH_SHORT).show());

        btnSuivant.setOnClickListener(view -> Toast.makeText(MainActivity.this, R.string.btn_suivant, Toast.LENGTH_SHORT).show());
    }

}