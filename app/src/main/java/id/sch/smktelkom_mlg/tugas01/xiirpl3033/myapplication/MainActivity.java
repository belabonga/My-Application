package id.sch.smktelkom_mlg.tugas01.xiirpl3033.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvHasil;
    EditText etNama, etTempat, etTahun;
    Button bSubmit;
    RadioButton rbKK, rbRS, rbROT;
    CheckBox cbP, cbNP, cbTSS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHasil = (TextView) findViewById(R.id.textView);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etTahun = (EditText) findViewById(R.id.editTextTahun);
        etTempat = (EditText) findViewById(R.id.editTextTempat);

        bSubmit = (Button) findViewById(R.id.buttonSubmit);

        rbKK = (RadioButton) findViewById(R.id.radioButtonKK);
        rbROT = (RadioButton) findViewById(R.id.radioButtonROT);
        rbRS = (RadioButton) findViewById(R.id.radioButtonRS);

        cbNP = (CheckBox) findViewById(R.id.checkBoxNP);
        cbP = (CheckBox) findViewById(R.id.checkBoxP);
        cbTSS = (CheckBox) findViewById(R.id.checkBoxTSS);


    }
}
