package com.example.myfirstjob.DataBase;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.myfirstjob.Models.Notes;

import java.util.List;

@Dao
public interface mainDao {

    @Insert(onConflict = REPLACE)
    void Insert(Notes notes);

    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Notes> getAll();

    @Query("UPDATE notes SET title=:title,notes=:notes WHERE ID=:id")
    void update(int id, String title, String notes);

    @Delete
    void delete(Notes notes);
}
