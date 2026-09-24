package com.example.memoapi.mapper;

import com.example.memoapi.dto.Note;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NoteMapper {

    @Select("SELECT id, title, content, created_at FROM notes ORDER BY created_at DESC")
    List<Note> findAll();
}
