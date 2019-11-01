package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}