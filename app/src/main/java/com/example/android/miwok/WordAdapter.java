package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;



/**
 {@link WordAdapter} is an {@link ArrayAdapter} that gives a layout for each list based on the list of {@link Word} objects
 Modeled on https://github.com/udacity/ud839_CustomAdapter_Example/blob/master/app/src/main/java/com/example/android/flavor/AndroidFlavorAdapter.java
 * with permission for Udacity course ABND
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    /**custom constructor, inflates layout file and populates list.
     *
     * @param context current context for layout file
     * @param numbers an ArrayList of words to display in list
     */

    public WordAdapter(Activity context, ArrayList<Word> numbers){
        super(context, 0 , numbers);
    }

    /**
     * Creates a view for an AdapterView
     * @param position position in the array that should be displayed in the list
     * @param convertView the view to populate
     * @param parent the parent ViewGroup where the view should be inflated
     * @return the View for the position in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get the object located at this position in the list
        Word currentWord = getItem(position);

        //find the TextView in the list_item.xml file that has the ID defaultTranslation
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultWord);
        //get the default translation and set this in the TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //find the TextView in the list_item.xml file that has the ID miwokTranslation
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokWord);
        //get the miwok translation and set this in the corresponding TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());




        return listItemView;
    }
}
