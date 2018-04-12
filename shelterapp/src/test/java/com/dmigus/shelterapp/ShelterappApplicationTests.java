package com.dmigus.shelterapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest

@AutoConfigureMockMvc
public class ShelterappApplicationTests {

    @RunWith(SpringRunner.class)
    @SpringBootTest
    public class SmokeTest {

        @Autowired
        private MainController controller;

        @Test
        public void contexLoads() {
            assertThat(controller).isNull();
        }

    }
}
