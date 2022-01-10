package com.battleq.play.domain.response;

import com.battleq.play.domain.MessageType;
import com.battleq.quiz.domain.dto.QuizPlayDto;
import com.battleq.quizItem.domain.dto.QuizItemPlayDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class MessageStartResponse {
    private LocalDateTime timestamp;
    private MessageType messageType;
    private String pin;
    private QuizPlayDto content;
    private String path;
}
