/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //create an array of number words
        ArrayList<Word> numbers = new ArrayList<>();
        //numbers.add("one");
        numbers.add(new Word("one","lutti"));
        numbers.add(new Word("two", "otiiko"));
        numbers.add(new Word("three", "tolookosu"));
        numbers.add(new Word("four","oyyisa"));
        numbers.add(new Word("five", "massokka"));
        numbers.add(new Word("six", "temmokka"));
        numbers.add(new Word("seven","kenekaku"));
        numbers.add(new Word("eight", "kawinta"));
        numbers.add(new Word("nine", "wo'e"));
        numbers.add(new Word("ten", "na'aacha"));

       /* LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

       for (int index = 0; index < numbers.size(); index ++){
       TextView wordView = new TextView(this);
       wordView.setText(numbers.get(index));
       rootView.addView(wordView);
      }*/
        WordAdapter itemsAdapter = new WordAdapter(this, numbers);

        // links adapter to listView
        ListView numberListView = (ListView) findViewById(R.id.list);
        numberListView.setAdapter(itemsAdapter);
    }
}
