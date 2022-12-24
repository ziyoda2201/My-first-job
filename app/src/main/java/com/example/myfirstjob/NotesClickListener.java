package com.example.myfirstjob;

import androidx.cardview.widget.CardView;

import com.example.myfirstjob.Models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
