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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY

    )
    @Column(
            name = "id",
            nullable = false
    )
    private Integer id;
    @Column(
            name = "user name",
            unique = true
    )
    private String userName;
    @ManyToOne
    @JoinColumn(
            name = "mail_id_user"
    )
    private Mail mail;
    @Column(
            name = "mailAddress",
            unique = true
    )
    private String mailAddress;
    private String passWord;

    public Integer getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public Mail getMail() {
        return this.mail;
    }

    public String getMailAddress() {
        return this.mailAddress;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public void setMail(final Mail mail) {
        this.mail = mail;
    }

    public void setMailAddress(final String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public void setPassWord(final String passWord) {
        this.passWord = passWord;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof User)) {
            return false;
        } else {
            User other = (User)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label71;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label71;
                    }

                    return false;
                }

                Object this$userName = this.getUserName();
                Object other$userName = other.getUserName();
                if (this$userName == null) {
                    if (other$userName != null) {
                        return false;
                    }
                } else if (!this$userName.equals(other$userName)) {
                    return false;
                }

                label57: {
                    Object this$mail = this.getMail();
                    Object other$mail = other.getMail();
                    if (this$mail == null) {
                        if (other$mail == null) {
                            break label57;
                        }
                    } else if (this$mail.equals(other$mail)) {
                        break label57;
                    }

                    return false;
                }

                Object this$mailAddress = this.getMailAddress();
                Object other$mailAddress = other.getMailAddress();
                if (this$mailAddress == null) {
                    if (other$mailAddress != null) {
                        return false;
                    }
                } else if (!this$mailAddress.equals(other$mailAddress)) {
                    return false;
                }

                Object this$passWord = this.getPassWord();
                Object other$passWord = other.getPassWord();
                if (this$passWord == null) {
                    if (other$passWord == null) {
                        return true;
                    }
                } else if (this$passWord.equals(other$passWord)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $userName = this.getUserName();
        result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
        Object $mail = this.getMail();
        result = result * 59 + ($mail == null ? 43 : $mail.hashCode());
        Object $mailAddress = this.getMailAddress();
        result = result * 59 + ($mailAddress == null ? 43 : $mailAddress.hashCode());
        Object $passWord = this.getPassWord();
        result = result * 59 + ($passWord == null ? 43 : $passWord.hashCode());
        return result;
    }

    public String toString() {
        Integer var10000 = this.getId();
        return "User(id=" + var10000 + ", userName=" + this.getUserName() + ", mail=" + this.getMail() + ", mailAddress=" + this.getMailAddress() + ", passWord=" + this.getPassWord() + ")";
    }

    public User() {
    }

    public User(final Integer id, final String userName, final Mail mail, final String mailAddress, final String passWord) {
        this.id = id;
        this.userName = userName;
        this.mail = mail;
        this.mailAddress = mailAddress;
        this.passWord = passWord;
    }
}
