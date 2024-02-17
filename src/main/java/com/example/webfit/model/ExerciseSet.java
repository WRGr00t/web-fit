package com.example.webfit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseSet {
    private Exercise exercise;
    private List<Fits> fitsList;
}
