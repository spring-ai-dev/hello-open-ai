package dev.springai.hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService hellloService;

    public HelloController(HelloService hellloService) {
        this.hellloService = hellloService;
    }

    @PostMapping(path="/ask", produces="application/json")
    public Answer ask(@RequestBody Question question) {
        return hellloService.askQuestion(question);
    }

}
