package Zadanie3_4.operacje_autor_email;

import Zadanie3_4.Message;

import java.io.File;

public interface EmailProcessor {
    void attachFileToEmail(File f);
    void sendEmail(Message m);
    Message[] readEmails(String server, String login, String pwd);
}

