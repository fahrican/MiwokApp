package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> familyMember = new ArrayList<Word>();
        familyMember.add(new Word("father", "әpә", R.drawable.family_father, R.raw.family_father));
        familyMember.add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        familyMember.add(new Word("son", "angsi", R.drawable.family_son, R.raw.family_son));
        familyMember.add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        familyMember.add(new Word("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyMember.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        familyMember.add(new Word("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyMember.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        familyMember.add(new Word("grandmother", "ama", R.drawable.family_grandmother, R.raw.family_grandfather));
        familyMember.add(new Word("grandfather", "paapa", R.drawable.family_father, R.raw.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, familyMember, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Word word = familyMember.get(i);

                mediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getSoundResourceId());
                mediaPlayer.start();
            }
        });
    }
}
