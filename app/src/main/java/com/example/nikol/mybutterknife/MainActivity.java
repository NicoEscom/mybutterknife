package com.example.nikol.mybutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.R.attr.onClick;
import static android.R.attr.text;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.textView) //con esto ya no se pone el findbyid
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void buttonPressed(){
        textView.setText("Hello butter knige!!!");
    }

}

