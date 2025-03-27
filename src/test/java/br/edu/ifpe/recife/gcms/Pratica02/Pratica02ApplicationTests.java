package br.edu.ifpe.recife.gcms.Pratica02;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class Pratica02ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, world!")));
	}
	
	@Test
	public void shouldReturnDefaultMessageFulano() throws Exception {
<<<<<<< HEAD
		this.mockMvc.perform(get("/carla")).andDo(print()).andExpect(status().isOk())
=======
		this.mockMvc.perform(get("/fulano")).andDo(print()).andExpect(status().isOk())
>>>>>>> a185e54 (resolvendo bugs)
		.andExpect(content().string(containsString("Hello, Carla Maria!")));
	}
	
	@Test
	public void shouldReturnDefaultMessagePessoa() throws Exception {
		this.mockMvc.perform(get("/pessoa")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("Hello, Carla Pessoa!")));
	}
<<<<<<< HEAD
	
	@Test
	public void shouldReturnDefaultMessageHotfix() throws Exception {
		this.mockMvc.perform(get("/hotfix")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("Hello, isto é um hotfix!")));
	}
=======

>>>>>>> a185e54 (resolvendo bugs)
}
