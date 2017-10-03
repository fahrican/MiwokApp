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
        familyMember.add(new Word("father", "әpә", R.drawable.family_father));
        familyMember.add(new Word("mother", "әṭa", R.drawable.family_mother));
        familyMember.add(new Word("son", "angsi", R.drawable.family_son));
        familyMember.add(new Word("daughter", "tune", R.drawable.family_daughter));
        familyMember.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        familyMember.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        familyMember.add(new Word("older sister", "teṭe", R.drawable.family_older_brother));
        familyMember.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        familyMember.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        familyMember.add(new Word("grandfather", "paapa", R.drawable.family_father));

        WordAdapter adapter = new WordAdapter(this, familyMember);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
