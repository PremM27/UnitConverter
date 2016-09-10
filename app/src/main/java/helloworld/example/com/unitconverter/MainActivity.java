package helloworld.example.com.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
 EditText temp;
    RadioButton f2c, c2f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp = (EditText)findViewById(R.id.temp);
        f2c = (RadioButton)findViewById(R.id.f2c);
        c2f = (RadioButton) findViewById(R.id.c2f);
    }

    public void convert(View v){
        double value = new Double(temp.getText().toString());
        if(c2f.isChecked())
            value = Converter.ftoc(value);
        else
            value = Converter.ctof(value);
        temp.setText(new Double(value).toString());
    }
}
