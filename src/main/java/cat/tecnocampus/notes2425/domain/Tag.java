package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

//Tag(String name)
@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    public Tag(){};

}
