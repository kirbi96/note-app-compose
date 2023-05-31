package com.kirbi96.noteapp.feature_note.data.repository

import com.kirbi96.noteapp.feature_note.data.data_sourse.NoteDao
import com.kirbi96.noteapp.feature_note.domain.model.Note
import com.kirbi96.noteapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNOteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }
}