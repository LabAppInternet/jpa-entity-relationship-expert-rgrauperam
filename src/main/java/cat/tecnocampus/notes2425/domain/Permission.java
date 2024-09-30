package cat.tecnocampus.notes2425.domain;
import jakarta.persistence.*;

//Permission(UserLab owner, Note note, boolean canRead, boolean canEdit)
@Entity
@Table(name = "permission")
public class Permission {
    @EmbeddedId
    private PermissionID id;
    private boolean canRead;
    private boolean canEdit;

    @ManyToOne
    @JoinColumn(name = "note")
    private Note note;
    @ManyToOne
    @JoinColumn(name = "owner")
    private UserLab owner;



}
