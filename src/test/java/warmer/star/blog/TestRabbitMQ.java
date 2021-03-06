package warmer.star.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import warmer.star.blog.util.RabbitMQSenderUtil;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BlogApplication.class)
@WebAppConfiguration
public class TestRabbitMQ {

	@Autowired
	private RabbitMQSenderUtil rabbitService;
	@Test
	public void TestSend() {
		rabbitService.send("helloQuence", "你好啊,RabbitMQ!");
	}
}
