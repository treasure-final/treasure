package boot.mvc.user;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.commons.lang3.RandomStringUtils;

public class MailSender {

    //난수 생성 해주기(영어+숫자 합쳐서 10자리)
    public static String getRamdomPassword(int size) {
        String randomPw=RandomStringUtils.randomAlphanumeric(size);
        return randomPw;
    }

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                //첫 번째 값에 내 이메일 설정
                return new PasswordAuthentication("treasure2hy@gmail.com", "tbndmhiceyolhnjz");
            }
        });

        //10자리 난수 생성
        String randomPw=getRamdomPassword(10);

        String receiver = "wn089@naver.com"; // 메일 받을 주소
        String title = "TREASURE 임시 비밀번호 발급";
        String content = "<h2 style='color:blue'>"+randomPw+"</h2><br>임시 비밀번호입니다.<br>이후 꼭 비밀번호를 변경해주세요.";
        Message message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress("treasure2hy@gmail.com", "관리자", "utf-8"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
            message.setSubject(title);
            message.setContent(content, "text/html; charset=utf-8");

            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}