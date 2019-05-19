package com.example.websocketdemo.config;

import com.example.websocketdemo.dataRepo.EmpRepo;
import com.example.websocketdemo.dataModel.ChatMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduleTask {
    private static final Logger log = LoggerFactory.getLogger(ScheduleTask.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;

    @Autowired
    EmpRepo  repo;

    @Scheduled(fixedRate = 1000)
    public void repoCurrentTime(){
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setType(ChatMessage.MessageType.LEAVE);
        chatMessage.setSender("DBConnection!");
//        chatMessage.setEmp(repo.getEMPDEPTLIST());

        log.info("The Time Checker " ,dateFormat.format(new Date()));

        messagingTemplate.convertAndSend("/topic/public", chatMessage);

        chatMessage = null;

    }
}
