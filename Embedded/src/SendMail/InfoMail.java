/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SendMail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class InfoMail {

    String username;
    String password;
    String Title;
    String Content;
    String personRecieve;
    Properties props;
    Session session;

    public InfoMail(String user, String pass, String title, String content, String person) {

        username = user;
        password = pass;
        Title = title;
        Content = content;
        personRecieve = person;

        props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

    }

    public void Send() {
        session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(personRecieve));
            message.setSubject(Title);
            message.setText(Content);

            Transport.send(message);

            System.out.println("Success!");

        } catch (MessagingException e) {
            System.out.println("Send mail is fail!!!");
            throw new RuntimeException(e);
        }
    }
 
}
