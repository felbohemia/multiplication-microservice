package mcroservices.book.multiplication.service;

import lombok.extern.slf4j.Slf4j;
import mcroservices.book.multiplication.challenge.ChallengeAttempt;
import mcroservices.book.multiplication.challenge.ChallengeAttemptDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



//@Service
@Slf4j
public class GamificationMicroserviceClient {
    @Value("${gamification.service.url}")
    private  String gamificationUrl;

    private RestTemplate restTemplate;

    public GamificationMicroserviceClient(final RestTemplate builder){
        restTemplate = builder;
    }

    public boolean sendAttemptToGamificationService(ChallengeAttemptDTO challengeAttempt){

        try{
            HttpEntity entity = new HttpEntity(challengeAttempt);
            ResponseEntity<String> response = restTemplate.exchange("http://gamification/attempt", HttpMethod.POST,entity,String.class);
            log.info("Gamiffication Response{}", response.getStatusCode());
            return response.getStatusCode().is2xxSuccessful();
        }
        catch (Exception e){
            log.info(e.getLocalizedMessage());
            return false;
        }
    }
}
