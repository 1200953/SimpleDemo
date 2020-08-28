package com.cromwell.demo.web;

import com.cromwell.demo.Model.User;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= MockServletContext.class)
@WebAppConfiguration
public class RControllerTest {

    private MockMvc mvc;

    @Mock
    private User user;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new RController()).build();
        user = mock(User.class);
    }


    @Test
    public void testUserController() throws Exception {
        User user = mock(User.class);
        RequestBuilder request = null;
        // 1、get查一下user列表，应该为空
//        request = get("/users/");
//        mvc.perform(get("/user/").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().string(equalTo("[]")));

        // 1、get查一下user列表，应该为空
        request = get("/user/");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));

//
//        // 2、post提交一个user
//        request = post("/user/")
//                .param("id", "1")
//                .param("name", "测试大师")
//                .param("age", "20");
//        mvc.perform(request)
//                .andExpect(content().string(equalTo("success")));
////
//        // 3、get获取user列表，应该有刚才插入的数据
//        request = get("/users/");
//        mvc.perform(request)
//                .andExpect(status().isOk())
//                .andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"测试大师\",\"age\":20}]")));
//        // 4、put修改id为1的user
//        request = put("/users/1")
//                .param("name", "测试终极大师")
//                .param("age", "30");
//        mvc.perform(request)
//                .andExpect(content().string(equalTo("success")));
//
//        // 5、get一个id为1的user
//        request = get("/users/1");
//        mvc.perform(request)
//                .andExpect(content().string(equalTo("{\"id\":1,\"name\":\"测试终极大师\",\"age\":30}")));
//
//        // 6、del删除id为1的user
//        request = delete("/users/1");
//        mvc.perform(request)
//                .andExpect(content().string(equalTo("success")));
//
//        // 7、get查一下user列表，应该为空
//        request = get("/users/");
//        mvc.perform(request)
//                .andExpect(status().isOk())
//                .andExpect(content().string(equalTo("[]")));

    }


}