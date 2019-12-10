package com.softwarica.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecycleView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleView);

        List<contracts> contractsList=new ArrayList<>();
        contractsList.add(new contracts("iron","I am IronMan.Don't do anything I would do, and definitely don't do anything I wouldn't do...","22:00",R.drawable.iron));
        contractsList.add(new contracts("spider","I am Spiderman.If a lion broke out of its cage at the zoo, and bit you, it would hurt, sure, and you'd be upset, of course. But would you be offended?","21:00",R.drawable.spider));
        contractsList.add(new contracts("thor","I am Thor.Thor once again shows his diplomatic abilities in resolving a dispute at the Stark Tower party in Age of Ultron.","14:00",R.drawable.thor));
        contractsList.add(new contracts("iron","I am IronMan.Don't do anything I would do, and definitely don't do anything I wouldn't do...","22:00",R.drawable.iron));
        contractsList.add(new contracts("spider","I am Spiderman.If a lion broke out of its cage at the zoo, and bit you, it would hurt, sure, and you'd be upset, of course. But would you be offended?","21:00",R.drawable.spider));
        contractsList.add(new contracts("thor","I am Thor.Thor once again shows his diplomatic abilities in resolving a dispute at the Stark Tower party in Age of Ultron.","14:00",R.drawable.thor));
        contractsList.add(new contracts("iron","I am IronMan.Don't do anything I would do, and definitely don't do anything I wouldn't do...","22:00",R.drawable.iron));
        contractsList.add(new contracts("spider","I am Spiderman.If a lion broke out of its cage at the zoo, and bit you, it would hurt, sure, and you'd be upset, of course. But would you be offended?","21:00",R.drawable.spider));
        contractsList.add(new contracts("thor","I am Thor.Thor once again shows his diplomatic abilities in resolving a dispute at the Stark Tower party in Age of Ultron.","14:00",R.drawable.thor));

        contactAdapter contactAdapter=new contactAdapter(this,contractsList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

