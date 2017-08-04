package com.div.test.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="note")
public class Note implements Serializable{

	private static final long serialVersionUID = -8223013212025027296L;

	@Column(name="noteid")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int noteId;

	@Column(name="title")
	private String title;

	@Column(name="note")
	private String note;

	@Column(name="createtime")
	private Date createTime;

	@Column(name="lastupdatetime")
	private Date lastUpdateTime;

	public Note() {
	}

	public Note(int noteId, String title, String note, Date createTime, Date lastUpdateTime) {
		this.noteId = noteId;
		this.title = title;
		this.note = note;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
	}

	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

}
