package com.example.finaldiploma.service;

import com.example.finaldiploma.model.Category;
import com.example.finaldiploma.model.Question;
import com.example.finaldiploma.repository.CategoryRepository;
import com.example.finaldiploma.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;
    //Save Question
    public void save(Question question) {

        questionRepository.save(question);
    }

}
