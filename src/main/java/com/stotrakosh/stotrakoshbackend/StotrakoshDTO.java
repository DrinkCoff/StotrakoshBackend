package com.stotrakosh.stotrakoshbackend;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity // This tells Hibernate to make a table out of this class
public class StotrakoshDTO {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Getter
    private Integer id;

    @Getter
    private String name;

    @Getter
    private String description;

//    private StotrakoshDTO convertToDto(Stotrakosh stotrakosh) {
//        StotrakoshDTO stotrakoshDTO; = modelMapper.map(stotrakosh, StotrakoshDTO.class);
//
//        return stotrakoshDTO;
//    }
}
