package com.example.homework1_7m.domain.use_cases

import com.example.homework1_7m.domain.model.Note
import com.example.homework1_7m.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(private val repo: NoteRepository) {

    fun deleteNote(note: Note) = repo.deleteNote(note)
}