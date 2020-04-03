package com.springbytes.sb.micrometer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CustomerControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Test case to check for basic setup and working of Get Operation
     * @throws Exception
     */
    @Test
    public void whenTestCustomerApp_thenAllResponse() throws Exception{
        String result = "[{\"id\":1,\"version\":null,\"fname\":\"John\",\"lname\":\"Doe\"},{\"id\":2,\"version\":null,\"fname\":\"Stephen\",\"lname\":\"Smith\"},{\"id\":3,\"version\":null,\"fname\":\"John3\",\"lname\":\"Doe\"},{\"id\":4,\"version\":null,\"fname\":\"Stephen4\",\"lname\":\"Smith\"},{\"id\":5,\"version\":null,\"fname\":\"John4\",\"lname\":\"Doe4\"},{\"id\":6,\"version\":null,\"fname\":\"Stephen5\",\"lname\":\"Smith5\"}]";
        this.mockMvc.perform(get("/customer"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(result));
    }
}
