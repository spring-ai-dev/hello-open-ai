package dev.springai.hello;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class SpringAiHelloService implements HelloService {

    private final ChatClient chatClient;
    
    public SpringAiHelloService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @Override
    public Answer askQuestion(Question question) {
        String answerText = chatClient.prompt()
            .user(question.question())
            .call()
            .content();
        return new Answer(answerText);
    }
    
}
