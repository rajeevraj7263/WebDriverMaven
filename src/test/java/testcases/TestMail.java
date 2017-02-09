package testcases;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import utility.TestConfig;
import utility.monitoringMail;



public class TestMail {

	public static void main(String[] args) throws AddressException, MessagingException {


		monitoringMail mail = new monitoringMail();
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.password,TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		
		
	}

}
