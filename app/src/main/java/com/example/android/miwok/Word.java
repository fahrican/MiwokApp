package com.example.android.miwok;

/**
 * Created by User on 30.09.2017.
 */

public class Word {

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageRescourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageRescourceId) {

        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageRescourceId = imageRescourceId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public int getTmageRescourceId() {

        return imageRescourceId;
    }

    public boolean hasImage(){
        return this.imageRescourceId != NO_IMAGE_PROVIDED;
    }

}//end of class Word
