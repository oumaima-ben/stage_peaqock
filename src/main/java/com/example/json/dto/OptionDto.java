package com.example.json.dto;

import com.example.json.entity.Question;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OptionDto {
    private Long id;
private String optionText;
//@JsonIgnore
//private QuestionDto question;

}