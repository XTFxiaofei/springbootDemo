package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerTest {
    @Autowired
    private MockMvc mvc;
    /**
     * @Date:16:09 2018/7/30
     * @Description:
     * @Param:  * @param
     * @Return:
     */
    @Test
    public void getStudentList() throws Exception {

        mvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
        //.andExpect(MockMvcResultMatchers.content().string("365"));  //测试接口返回内容
    }

}