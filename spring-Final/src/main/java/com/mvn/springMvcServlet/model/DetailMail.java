//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mvn.springMvcServlet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DetailMail {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "id",
            nullable = false
    )
    private Long id;
    private int mailID;
    private int senderID;
    private int receiverID;

    public DetailMail() {
    }

    public Long getId() {
        return this.id;
    }

    public int getMailID() {
        return this.mailID;
    }

    public int getSenderID() {
        return this.senderID;
    }

    public int getReceiverID() {
        return this.receiverID;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setMailID(final int mailID) {
        this.mailID = mailID;
    }

    public void setSenderID(final int senderID) {
        this.senderID = senderID;
    }

    public void setReceiverID(final int receiverID) {
        this.receiverID = receiverID;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof DetailMail)) {
            return false;
        } else {
            DetailMail other = (DetailMail)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getMailID() != other.getMailID()) {
                return false;
            } else if (this.getSenderID() != other.getSenderID()) {
                return false;
            } else if (this.getReceiverID() != other.getReceiverID()) {
                return false;
            } else {
                Object this$id = this.getId();
                Object other$id = other.getId();
                if (this$id == null) {
                    if (other$id != null) {
                        return false;
                    }
                } else if (!this$id.equals(other$id)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DetailMail;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + this.getMailID();
        result = result * 59 + this.getSenderID();
        result = result * 59 + this.getReceiverID();
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "DetailMail(id=" + var10000 + ", mailID=" + this.getMailID() + ", senderID=" + this.getSenderID() + ", receiverID=" + this.getReceiverID() + ")";
    }
}
