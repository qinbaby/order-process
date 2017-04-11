package com.warehouse.sellercube;

import com.warehouse.sellercube.JMS.Sender;
import com.warehouse.sellercube.server.order.mysql.service.TestService;
import com.warehouse.sellercube.server.order.sqlserver.service.TestsqlserverService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderPreprocessApplicationTests {

	@Autowired
	private TestService testService;

	@Autowired
	private TestsqlserverService testsqlserver;

	@Test
	public void contextLoads() {
		/*System.out.println(testService.selectByPrimary(1l).getOrderid());
		System.out.println(testsqlserver.selectByPrimary(1l).getOrderid());*/

	}

	@Autowired
	private Sender sender;
	@Test
	public void hello() throws Exception {
		sender.send();
	}
}
