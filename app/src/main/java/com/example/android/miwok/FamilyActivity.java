package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> familyMember = new ArrayList<Word>();
        familyMember.add(new Word("father", "әpә"));
        familyMember.add(new Word("mother", "әṭa"));
        familyMember.add(new Word("son", "angsi"));
        familyMember.add(new Word("daughter", "tune"));
        familyMember.add(new Word("older brother", "taachi"));
        familyMember.add(new Word("younger brother", "chalitti"));
        familyMember.add(new Word("older sister", "teṭe"));
        familyMember.add(new Word("younger sister", "kolliti"));
        familyMember.add(new Word("grandmother", "ama"));
        familyMember.add(new Word("grandfather", "paapa"));

        WordAdapter adapter = new WordAdapter(this, familyMember);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
