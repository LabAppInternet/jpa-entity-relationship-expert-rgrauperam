package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PermissionID implements Serializable {
    private long noteID;
    private long userID;
    public PermissionID() {}
    public PermissionID(long noteID, long userID){
        this.noteID = noteID;
        this.userID = userID;
    }
    public long getNoteID() {
        return noteID;
    }

    public void setNoteID(long noteID) {
        this.noteID = noteID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }
}
