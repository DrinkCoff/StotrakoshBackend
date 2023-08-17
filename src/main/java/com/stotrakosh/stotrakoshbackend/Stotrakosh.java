package com.stotrakosh.stotrakoshbackend;


        import jakarta.persistence.Entity;
        import jakarta.persistence.GeneratedValue;
        import jakarta.persistence.GenerationType;
        import jakarta.persistence.Id;
        import lombok.Getter;

@Entity // This tells Hibernate to make a table out of this class
public class Stotrakosh {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Getter
    public Integer id;

    @Getter
    public String name;

    @Getter
    public String description;
}
