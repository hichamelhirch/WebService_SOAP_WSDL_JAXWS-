package net.hicham.WS;

import java.util.Date;

public class Compte {
    private int code;
    private double soulde;
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code, double soulde, Date dateCreation) {
        this.code = code;
        this.soulde = soulde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSoulde() {
        return soulde;
    }

    public void setSoulde(double soulde) {
        this.soulde = soulde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", soulde=" + soulde +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
