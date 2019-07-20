package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    double var1,var2;

    int operation = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);




    }





    public void allClear(View view) {
        textView.setText("");
    }

    public void clear(View view) {
        String str = textView.getText().toString();
        if (str.contains(".")) {
            String[] parts = str.split("\\.");

            if (parts[1].length() > 1) {
                str = str.substring(0, str.length() - 1);
            } else {
                str = str.substring(0, str.length() - 2);
            }

            textView.setText(str);

        }else{
            str = str.substring(0, str.length() - 1);
            textView.setText(str);
        }

    }

    public void setText(View view) {
        textView.setText(textView.getText().toString()+ view.getTag().toString());
    }

    public void operation(View view) {

        var1 = Double.parseDouble(textView.getText().toString());


        textView.setText("");
        operation = Integer.parseInt(view.getTag().toString());


    }

    public void calculation(View view) {
        var2 = Double.parseDouble(textView.getText().toString());

        if(operation == 1)
        {
            textView.setText(var1+"+"+var2+"="+(var1+var2)+"");


        }else if(operation == 2){
            textView.setText(var1+"-"+var2+"="+(var1-var2)+"");

        }else if(operation == 3){
            textView.setText(var1+"x"+var2+"="+var1*var2+"");

        }else if(operation == 4){
            textView.setText(var1+"/"+var2+"="+var1/var2+"");

        }else if(operation == 5){
            textView.setText(var1+"%"+var2+"="+var1%var2+"");




        }
    }
}
