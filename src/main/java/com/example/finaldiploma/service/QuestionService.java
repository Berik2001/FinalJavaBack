package com.example.finaldiploma.service;

import com.example.finaldiploma.model.Category;
import com.example.finaldiploma.model.Question;
import com.example.finaldiploma.model.Review;
import com.example.finaldiploma.repository.CategoryRepository;
import com.example.finaldiploma.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    //Save Question
    public void save(Question question) {

        questionRepository.save(question);
    }

    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    public Question updateQuestion(Question question) {
        Question old = questionRepository.getById(question.getId());
        old.setName(question.getName());
        old.setQuestion(question.getQuestion());
        old.setEmail(question.getEmail());

        questionRepository.save(old);
        return old;
    }

    public void deleteQuestion(int id) {
        questionRepository.deleteById(Long.valueOf(id));
    }
}
