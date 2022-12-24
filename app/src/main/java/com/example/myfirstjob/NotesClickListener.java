package com.example.myfirstjob;

import androidx.cardview.widget.CardView;

import com.example.myfirstjob.models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
