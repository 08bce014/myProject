package com.div.test.dao;

import java.util.List;

import com.div.test.model.Note;

public interface NoteDao {

	Note findById(int id);
	void saveNote(Note note);
	void deleteNote(Note note);
	List<Note> findAllNotes();
	void updateNote(Note note);
}
