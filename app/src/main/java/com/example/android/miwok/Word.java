package com.example.android.miwok;

/**
 * {@link Word}  has a vocabulary word in a
 */
public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;


    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
// returns the default translation of word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    // returns the miwok translation of word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
