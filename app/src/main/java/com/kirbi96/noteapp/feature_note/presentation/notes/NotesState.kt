package com.kirbi96.noteapp.feature_note.presentation.notes

import com.kirbi96.noteapp.feature_note.domain.model.Note
import com.kirbi96.noteapp.feature_note.domain.util.NoteOrder
import com.kirbi96.noteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val notesOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
