package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static Character hero;
    IFabric currentRoom = new GenerateSituation1();

    @SuppressLint("SetTextI18n")
    void PutData(IFabric current){
        TextView title = findViewById(R.id.title_of_story);
        TextView story = findViewById(R.id.story);
        TextView charactersOfHero= findViewById(R.id.characters);

        Button b1 = (Button) findViewById(R.id.choice1);
        Button b2 = (Button) findViewById(R.id.choice2);
        Button b3 = (Button) findViewById(R.id.choice3);
        title.setText(current.createSit().title);
        story.setText(current.createSit().history);
        if (current.createSit().ways.size()>0){
            String[] strings=current.createSit().ways.keySet().toArray(new String[current.createSit().ways.size()]);
            b1.setText(strings[0]);
            b2.setText(strings[1]);
            b3.setText(strings[2]);
        } else{
            b1.setText("Смерть");
            b2.setText("Смерть");
            b3.setText("Смерть");
        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hero = Character.getCharacter();
        PutData(currentRoom);
        Button b1 = (Button) findViewById(R.id.choice1);
        Button b2 = (Button) findViewById(R.id.choice2);
        Button b3 = (Button) findViewById(R.id.choice3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key= (String) b1.getText();
                currentRoom = currentRoom.createSit().ways.get(key);
                PutData(currentRoom);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key= (String) b2.getText();
                currentRoom = currentRoom.createSit().ways.get(key);
                PutData(currentRoom);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key= (String) b3.getText();
                currentRoom = currentRoom.createSit().ways.get(key);
                PutData(currentRoom);
            }
        });
    }
}




