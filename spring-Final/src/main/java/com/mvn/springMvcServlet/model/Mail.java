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
public class Mail {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "idMail",
            nullable = false
    )
    private int id;
    private int senderID;
    private String subject;
    private String body;
    private int receiverID;
    private String mailAddressReceiver;

    public Mail() {
    }

    public Mail(final int id, final int senderID, final String subject, final String body, final int receiverID, final String mailAddressReceiver) {
        this.id = id;
        this.senderID = senderID;
        this.subject = subject;
        this.body = body;
        this.receiverID = receiverID;
        this.mailAddressReceiver = mailAddressReceiver;
    }

    public int getId() {
        return this.id;
    }

    public int getSenderID() {
        return this.senderID;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getBody() {
        return this.body;
    }

    public int getReceiverID() {
        return this.receiverID;
    }

    public String getMailAddressReceiver() {
        return this.mailAddressReceiver;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setSenderID(final int senderID) {
        this.senderID = senderID;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    public void setBody(final String body) {
        this.body = body;
    }

    public void setReceiverID(final int receiverID) {
        this.receiverID = receiverID;
    }

    public void setMailAddressReceiver(final String mailAddressReceiver) {
        this.mailAddressReceiver = mailAddressReceiver;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Mail)) {
            return false;
        } else {
            Mail other = (Mail)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getId() != other.getId()) {
                return false;
            } else if (this.getSenderID() != other.getSenderID()) {
                return false;
            } else if (this.getReceiverID() != other.getReceiverID()) {
                return false;
            } else {
                label54: {
                    Object this$subject = this.getSubject();
                    Object other$subject = other.getSubject();
                    if (this$subject == null) {
                        if (other$subject == null) {
                            break label54;
                        }
                    } else if (this$subject.equals(other$subject)) {
                        break label54;
                    }

                    return false;
                }

                Object this$body = this.getBody();
                Object other$body = other.getBody();
                if (this$body == null) {
                    if (other$body != null) {
                        return false;
                    }
                } else if (!this$body.equals(other$body)) {
                    return false;
                }

                Object this$mailAddressReceiver = this.getMailAddressReceiver();
                Object other$mailAddressReceiver = other.getMailAddressReceiver();
                if (this$mailAddressReceiver == null) {
                    if (other$mailAddressReceiver != null) {
                        return false;
                    }
                } else if (!this$mailAddressReceiver.equals(other$mailAddressReceiver)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Mail;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + this.getId();
        result = result * 59 + this.getSenderID();
        result = result * 59 + this.getReceiverID();
        Object $subject = this.getSubject();
        result = result * 59 + ($subject == null ? 43 : $subject.hashCode());
        Object $body = this.getBody();
        result = result * 59 + ($body == null ? 43 : $body.hashCode());
        Object $mailAddressReceiver = this.getMailAddressReceiver();
        result = result * 59 + ($mailAddressReceiver == null ? 43 : $mailAddressReceiver.hashCode());
        return result;
    }

    public String toString() {
        int var10000 = this.getId();
        return "Mail(id=" + var10000 + ", senderID=" + this.getSenderID() + ", subject=" + this.getSubject() + ", body=" + this.getBody() + ", receiverID=" + this.getReceiverID() + ", mailAddressReceiver=" + this.getMailAddressReceiver() + ")";
    }
}
