package com.example.roonwordssample;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;
@Dao
public interface WordDao {

//@Insert for insert but
    //OnConflictStrategy.IGNORE is for ignore the existed primary key
        @Insert(onConflict = OnConflictStrategy.IGNORE)
        //to rename function
    void insert(Word word);

        @Query("DELETE FROM word_table")
        void deleteAll();

    @Query("SELECT * from word_table ORDER BY word ASC")
    //word is is a table name
    LiveData<List<Word>> getAllWords();


}
