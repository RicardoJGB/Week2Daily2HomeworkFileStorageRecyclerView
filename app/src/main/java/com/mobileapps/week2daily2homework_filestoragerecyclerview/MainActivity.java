package com.mobileapps.week2daily2homework_filestoragerecyclerview;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvRecyclerView;
    ImageView ivAnimalPic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRecyclerView=findViewById(R.id.rvRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter(this, getAnimols());
        rvRecyclerView.setLayoutManager(layoutManager);
        rvRecyclerView.setAdapter(recyclerViewAdapter);



    }

    public ArrayList<Animals> getAnimols(){
        ArrayList<Animals> returnList=new ArrayList<>();

        returnList.add(new Animals("Great White Shark","Lamnidae","Carcharodon carcharias","great_white_shark_2"));
        returnList.add(new Animals("Snowy Owl","Strigidae","Bubo scandiacus","snowy_owl"));
        returnList.add(new Animals("Eurasian Wolf","Canidae","Canis lupus lupus","eurasian_wolf"));
        returnList.add(new Animals("Red-tailed Hawk","Accipitridae","Buteo jamaicensis","red_tailed_hawk"));
        returnList.add(new Animals("Maori Octopus","Octopodidae","Macroctopus maorum","maori_octopus"));
        return returnList;
    }

    public void CLICK(View view) {
        switch (view.getId()){
            case R.id.btnSharkPic:
                Intent intent_shark=new Intent(this,AnimalDetails.class);
                startActivity(intent_shark);
                break;

        }

    }
}
