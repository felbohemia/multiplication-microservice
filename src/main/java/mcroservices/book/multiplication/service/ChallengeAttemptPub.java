package mcroservices.book.multiplication.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mcroservices.book.multiplication.challenge.ChallengeAttempt;
import mcroservices.book.multiplication.challenge.ChallengeAttemptDTO;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
//@RequiredArgsConstructor
public class ChallengeAttemptPub {

    @Autowired
    private AmqpTemplate amqpTemplate;
    private String topicExchange;

    public ChallengeAttemptPub(final AmqpTemplate template, @Value("${amqp.exchange.topic}") final String topic){
        this.amqpTemplate = template;
        this.topicExchange = topic;
    }

    public void sendMessageToBroker(ChallengeAttempt dto){
        ChallengeAttemptDTO challengeAttemptDTO = challengeAttemptDTO(dto);
        String routingKey = dto.isCorrect() ? "attempt.correct": "attempt.wrong";
        amqpTemplate.convertAndSend(topicExchange,routingKey,challengeAttemptDTO);
        log.info("Sending message {} to the Messaging Channel", challengeAttemptDTO);
    }

    private ChallengeAttemptDTO challengeAttemptDTO (ChallengeAttempt attempt){
        return new ChallengeAttemptDTO(attempt.getFactorA(),attempt.getFactorB(),attempt.getAlias(),attempt.getResult_Attempt());
    }
}
