package com.api.thirukural.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Kural")
public class Kural {
    @Id
    private Object id;
    private int number;
    private String line1;
    private String line2;
    private String translation;
    private String mv;
    private String sp;
    private String mk;
    private String explanation;
    private String couplet;
    private String transliteration1;
    private String transliteration2;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getMv() {
        return mv;
    }

    public void setMv(String mv) {
        this.mv = mv;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getCouplet() {
        return couplet;
    }

    public void setCouplet(String couplet) {
        this.couplet = couplet;
    }

    public String getTransliteration1() {
        return transliteration1;
    }

    public void setTransliteration1(String transliteration1) {
        this.transliteration1 = transliteration1;
    }

    public String getTransliteration2() {
        return transliteration2;
    }

    public void setTransliteration2(String transliteration2) {
        this.transliteration2 = transliteration2;
    }
}
