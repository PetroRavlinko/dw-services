package com.dw.services;

import com.dw.services.dto.DwDto;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HomeControllerTest {
	@Test
	public void shouldReturnHome() {
		HomeController controller = new HomeController();
		DwDto actual = controller.home();
		assertEquals("Hello!", actual.getMessage());
		assertArrayEquals(Collections.EMPTY_LIST.toArray(), actual.getErrors().toArray());
	}
}
