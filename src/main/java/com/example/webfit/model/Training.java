package com.example.webfit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Training {
    private LocalDateTime startAt;
    private LocalDateTime ednAt;
    private List<ExerciseSet> trainingSet;
}
