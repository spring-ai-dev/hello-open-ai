# hello-open-ai

Sample Hello World app for Spring AI with OpenAI.

This sample is loosely based on the `board-game-buddy` sample from [Chapter 1 of Spring AI in Action](https://livebook.manning.com/book/spring-ai-in-action/chapter-1) by Craig Walls.


## Try it

### OpenAI token

You need an OpenAI token to run this sample. You can generate one after you create an account on [OpenAI](https://platform.openai.com).

To run the app you need to set an environment variable with the API toke:

```sh
export SPRING_AI_OPENAI_API_KEY=<YOUR-OPENAI-API-KEY>
```

### Build

You need Java 21 or higher to build this sample.

Run this command to build:

```sh
./gradlew build
```

### Run

Run this command to run the app:

```sh
./gradlew bootRun
```

You can now use [curl](https://curl.se/) to ask quesions:

```sh
curl localhost:8080/ask \
    -H "Content-type: application/json" \
    -d '{"question":"Who founded the Spring Framework?"}'
```

You can also use [httpie](https://httpie.io/) to ask quesions:

```sh
http :8080/ask question="Who founded the Spring Framework?"
```
