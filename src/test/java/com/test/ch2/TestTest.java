package com.test.ch2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void main() {

        String url = "http://localhost/test";

        //when
        ResponseEntity<T> response =  restTemplate.getForEntity(url, T);


        //then
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isGreaterThan(0L);

        List<Board> list = boardRepository.findAll();

        assertThat(list.get(0).getAuthor()).isEqualTo(author);
        assertThat(list.get(0).getTitle()).isEqualTo(title);
        assertThat(list.get(0).getContent()).isEqualTo(content);
    }
}