package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;
@Entity(name = "Note")
@Table(name = "note")
public class Note {

    @Id
    @GeneratedValue
    private long id;

    private String title;
    private String content;
    private LocalDateTime creationDate;
    @ManyToMany(
            mappedBy = "note",
            cascade = CascadeType.ALL
    )
    private Set<Tag> tags;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private UserLab owner;





}
