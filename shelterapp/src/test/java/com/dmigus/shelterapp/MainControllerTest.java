package com.dmigus.shelterapp;

import com.dmigus.shelterapp.api.DogRepository;
import com.dmigus.shelterapp.api.ImageRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
@AutoConfigureMockMvc
@WebAppConfiguration

@WithMockUser
public class MainControllerTest {

    @MockBean
    private MainController mainControllerTest;
    private ImageRepository imageRepositoryTest;
    private DogRepository dogRepositoryTest;
    @Autowired
    private MockMvc mockMvc;

    @Test


    public void login() throws Exception {
        this.mockMvc.perform(get("/login")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Logowania")));
    }


    @Test
    public void index() throws Exception {
        this.mockMvc.perform(get("/index")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Lista")));
    }
}


