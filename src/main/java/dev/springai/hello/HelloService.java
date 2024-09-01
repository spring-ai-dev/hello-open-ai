package dev.springai.hello;

import org.springframework.stereotype.Service;

@Service
public interface HelloService {
    Answer askQuestion(Question question);
}
