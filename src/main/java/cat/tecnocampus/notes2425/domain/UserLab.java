package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;
//UserLab(long id, String username, String email)
@Entity
@Table(name = "userlab")
public class UserLab {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String email;


}
