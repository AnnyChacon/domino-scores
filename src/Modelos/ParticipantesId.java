package Modelos;
// Generated 24/02/2018 01:40:43 PM by Hibernate Tools 4.3.1

/**
 * ParticipantesId generated by hbm2java
 */
public class ParticipantesId implements java.io.Serializable {

    private int id;
    private int partidaId;

    public ParticipantesId() {
    }

    public ParticipantesId(int id, int partidaId) {
        this.id = id;
        this.partidaId = partidaId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartidaId() {
        return this.partidaId;
    }

    public void setPartidaId(int partidaId) {
        this.partidaId = partidaId;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof ParticipantesId)) {
            return false;
        }
        ParticipantesId castOther = (ParticipantesId) other;

        return (this.getId() == castOther.getId())
                && (this.getPartidaId() == castOther.getPartidaId());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getId();
        result = 37 * result + this.getPartidaId();
        return result;
    }

}