package com.example.medialib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.showMedia);

        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        TextView outputText = (TextView) findViewById(R.id.showTxt);

        System.out.println("Welcome to your Media Library");

        outputText.setText("SONGS:");
        outputText.append("\n");

        Songs song1 = new Songs();
        song1.setTitle("One - Metallica");
        outputText.append(song1.getTitle());
        outputText.append("\n");
        Songs song2 = new Songs();
        song2.setTitle("My Friend Of Misery - Metallica");
        outputText.append(song2.getTitle());
        outputText.append("\n");
        Songs song3 = new Songs();
        song3.setTitle("Master of Puppets - Metallica");
        outputText.append(song3.getTitle());
        outputText.append("\n");
        Songs song4 = new Songs();
        song4.setTitle("Enter Sandman - Metallica");
        outputText.append(song4.getTitle());
        outputText.append("\n");
        Songs song5 = new Songs();
        song5.setTitle("Ride the Lightning - Metallica");
        outputText.append(song5.getTitle());
        outputText.append("\n");
        Songs song6 = new Songs();
        song6.setTitle("Nothing Else Matters - Metallica");
        outputText.append(song6.getTitle());
        outputText.append("\n");
        Songs song7 = new Songs();
        song7.setTitle("Fade to Black - Metallica");
        outputText.append(song7.getTitle());
        outputText.append("\n");
        Songs song8 = new Songs();
        song8.setTitle("Sad But True - Metallica");
        outputText.append(song8.getTitle());
        outputText.append("\n");
        Movies movie1 = new Movies();
        movie1.setTitle("Tropic Thunder");
        outputText.append(movie1.getTitle());
        outputText.append("\n");
        Books book1 = new Books();
        book1.setTitle("Mein Kampf");
        outputText.append(book1.getTitle());
        outputText.append("\n");
    }
}
