package id.sch.smktelkom_mlg.tugas01.xiirpl3033.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvHasil;
    EditText etTempat, etTahun;
    EditText etNama;
    Button bSubmit;
    RadioGroup rgTempatTinggal;
    // RadioButton rbKK, rbRS, rbROT;
    CheckBox cbP, cbNP, cbTSS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etTahun = (EditText) findViewById(R.id.editTextTahun);
        etTempat = (EditText) findViewById(R.id.editTextTempat);

        bSubmit = (Button) findViewById(R.id.buttonSubmit);

    /*    rbKK = (RadioButton) findViewById(R.id.radioButtonKK);
        rbROT = (RadioButton) findViewById(R.id.radioButtonROT);
        rbRS = (RadioButton) findViewById(R.id.radioButtonRS); */

        rgTempatTinggal = (RadioGroup) findViewById(R.id.radioGroupTT);

        cbNP = (CheckBox) findViewById(R.id.checkBoxNP);
        cbP = (CheckBox) findViewById(R.id.checkBoxP);
        cbTSS = (CheckBox) findViewById(R.id.checkBoxTSS);

        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();
            }
        });

    }

    private void doProcess() {
        if (isValid()) {
            String nama = etNama.getText().toString();
            String tempat = etTempat.getText().toString();
            int tahun = Integer.parseInt(etTahun.getText().toString());
            int usia = 2016 - tahun;

            String TempatTinggal = "Tempat Tinggal :  ";
            int tt = TempatTinggal.length();
            if (rgTempatTinggal.getCheckedRadioButtonId() != -1) {
                RadioButton rb = (RadioButton)
                        findViewById(rgTempatTinggal.getCheckedRadioButtonId());
                TempatTinggal += rb.getText().toString() + "\n";
            }

            if (TempatTinggal.length() == tt) {
                TempatTinggal += "Anda belum memilih tempat tinggal \n ";
            }

            tvHasil.setText("Nama    :  " + nama + "\n" + "Tempat Lahir  :  " + tempat + "\n" + "Usia  :  " + usia + "\n" + TempatTinggal);
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Nama belum diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karakter");
            valid = false;
        } else {
            etNama.setError(null);
        }

        return valid;
    }

}
