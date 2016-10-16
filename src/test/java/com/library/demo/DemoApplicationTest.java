package com.library.demo;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void verifyIndexPage() throws Exception {
		mockMvc.perform(get("/index.html"))
				.andExpect(content().string(containsString("Library Demo - Home Page")))
				.andExpect(status().isOk());
	}

	@Test
	public void verifyUsersPage() throws Exception {
		mockMvc.perform(get("/users"))
				.andExpect(content().string(containsString("Mrs Sam")))
				.andExpect(view().name("users"))
				.andExpect(status().isOk());
	}

	@Test
	public void verifyBooksPage() throws Exception {
		mockMvc.perform(get("/books"))
				.andExpect(content().string(containsString("978-1-56619-909-1")))
				.andExpect(view().name("books"))
				.andExpect(status().isOk());
	}

	@Test
	public void verifyBooksPageWithUserParam() throws Exception {
		mockMvc.perform(get("/books").param("userId", "1"))
				.andExpect(content().string(containsString("William Shakespeare")))
				.andExpect(view().name("books :: booksLent"))
				.andExpect(status().isOk());
	}

}
