package com.mobileapps.week2daily2homework_filestoragerecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AnimalDetails extends AppCompatActivity {

    TextView tvSharkFacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_details);

        tvSharkFacts=findViewById(R.id.tvSharkFacts);
    }

    public void CLICK2(View view) {
        switch (view.getId()){
            case R.id.btnBackToMain:
                Intent intentBackToMain1=new Intent(this,MainActivity.class);
                startActivity(intentBackToMain1);
                break;
        }

    }
}
