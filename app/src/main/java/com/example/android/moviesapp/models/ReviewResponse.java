package com.example.android.moviesapp.models;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/** Helper class needed to parse JSON array with review information*/

public class ReviewResponse {

    @SerializedName("results")
    private ArrayList<Review> results;

    public ArrayList<Review> getResults() {
        return results;
    }

    public void setResults(ArrayList<Review> results) {
        this.results = results;
    }
}
