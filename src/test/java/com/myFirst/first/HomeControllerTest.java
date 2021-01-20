package com.myFirst.first;

import javax.sql.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"file:WebContent/WEB-INF/classes/applicationContext*.xml"})
public class HomeControllerTest {
	
	@Test
	public void dataSourceTest() {
		
	}
}
