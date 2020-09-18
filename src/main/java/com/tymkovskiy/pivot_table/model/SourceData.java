package com.tymkovskiy.pivot_table.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name= "source_data")
public class SourceData {

    @Id
    private Integer oid;
    @Column(name = "a" )
    private String a;
    @Column(name = "b" )
    private String b;
    @Column(name = "c" )
    private String c;
    @Column(name = "d" )
    private String d;
    @Column(name = "y" )
    private Integer y;
    @Column(name = "v" )
    private Integer v;

    public SourceData() {
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SourceData)) return false;
        SourceData sourceData = (SourceData) o;
        return Objects.equals(getOid(), sourceData.getOid()) &&
                Objects.equals(getA(), sourceData.getA()) &&
                Objects.equals(getB(), sourceData.getB()) &&
                Objects.equals(getC(), sourceData.getC()) &&
                Objects.equals(getD(), sourceData.getD()) &&
                Objects.equals(getY(), sourceData.getY()) &&
                Objects.equals(getV(), sourceData.getV());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOid(), getA(), getB(), getC(), getD(), getY(), getV());
    }

    @Override
    public String toString() {
        return "SourceData{" +
                "oid=" + oid +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", y=" + y +
                ", v=" + v +
                '}';
    }
}
