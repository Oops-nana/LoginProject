package myFirstdao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisTest{

	public void gettingStarted() throws Exception {
	String resource = "myBatisTestConfig.xml";
	InputStream inputStream = Resources.getResourceAsStream(resource);
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
}
