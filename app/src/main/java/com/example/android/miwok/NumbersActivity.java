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
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //create an array of number words
       ArrayList<String> numbers = new ArrayList<String>();
       numbers.add("one");
       numbers.add("two");
       numbers.add("three");
       numbers.add("four");
       numbers.add("five");
       numbers.add("six");
       numbers.add("seven");
       numbers.add("eight");
       numbers.add("nine");
       numbers.add("ten");

       int index = 0;
       while (index < 10){
       LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
       TextView wordView = new TextView(this);
       wordView.setText(numbers.get(index));
       rootView.addView(wordView);
       index++;}
    }
}
