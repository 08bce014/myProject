package com.div.test.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.div.test.model.Note;

@Repository("noteDao")
@Transactional
public class NoteDaoImpl extends AbstractDao<Integer, Note> implements NoteDao {

	@Override
	public Note findById(int id) {
		// TODO Auto-generated method stub
		return findById(id);
	}

	@Override
	public void saveNote(Note note) {
		// TODO Auto-generated method stub
		persist(note);
	}

	@Override
	public void deleteNote(Note note) {
		// TODO Auto-generated method stub
		delete(note);
	}

	@Override
	public List<Note> findAllNotes() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void updateNote(Note note) {
		// TODO Auto-generated method stub
		update(note);
	}

}
