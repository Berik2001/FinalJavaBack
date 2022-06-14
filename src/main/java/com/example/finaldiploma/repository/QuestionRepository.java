package com.example.finaldiploma.repository;

import com.example.finaldiploma.model.Category;
import com.example.finaldiploma.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {


}