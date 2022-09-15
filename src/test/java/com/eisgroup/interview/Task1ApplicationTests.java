package com.eisgroup.interview;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {InterviewApplication.class})
@AutoConfigureMockMvc
class Task1ApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate template;

    @Test
    public void testIfPoliciesReturnedFromController() throws IOException {
        String body = template.getForEntity("http://localhost:" + port + "/", String.class).getBody();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode result = mapper.readTree(body);

        assertEquals(true, result.isArray());

        int elements = 0;
        if (result.isArray()){
            for (JsonNode node : result){
                elements++;
            }
        }

        assertThat(elements).isEqualTo(640);
    }
}
