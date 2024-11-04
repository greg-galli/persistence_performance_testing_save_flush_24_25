package fr.mbds.testtypes;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@Entity
@Table(name = "BTTable")
public class BasicTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long anId;
    @Column(unique = true, nullable = false, length = 50)
    private String aString;
    @Column(name = "integer")
    private int anInt;
    @Transient
    private boolean aBoolean;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] aByteArray;
    @Column(scale = 2)
    private float aFloat;
    private double aDouble;
    private char aChar;
    private byte aByte;
    @UpdateTimestamp
    private Date aDate;
    @CreationTimestamp
    private LocalDate aLocalDate;
    private Time aTime;
    private Calendar aCalendar;
    private Locale aLocale;
    private UUID anUUID;
    @Column(columnDefinition="TEXT")
    private String aDescription;



    public BasicTypes() {
    }

    public BasicTypes(Long anId, String aString, int anInt, boolean aBoolean, double aDouble, float aFloat, char aChar, byte aByte, Date aDate, LocalDate aLocalDate, Time aTime, Calendar aCalendar, Locale aLocale, byte[] aByteArray, UUID anUUID) {
        this.anId = anId;
        this.aString = aString;
        this.anInt = anInt;
        this.aBoolean = aBoolean;
        this.aDouble = aDouble;
        this.aFloat = aFloat;
        this.aChar = aChar;
        this.aByte = aByte;
        this.aDate = aDate;
        this.aLocalDate = aLocalDate;
        this.aTime = aTime;
        this.aCalendar = aCalendar;
        this.aLocale = aLocale;
        this.aByteArray = aByteArray;
        this.anUUID = anUUID;
    }

    public Long getAnId() {
        return anId;
    }

    public void setAnId(Long anId) {
        this.anId = anId;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public byte getaByte() {
        return aByte;
    }

    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public Date getaDate() {
        return aDate;
    }

    public void setaDate(Date aDate) {
        this.aDate = aDate;
    }

    public LocalDate getaLocalDate() {
        return aLocalDate;
    }

    public void setaLocalDate(LocalDate aLocalDate) {
        this.aLocalDate = aLocalDate;
    }

    public Time getaTime() {
        return aTime;
    }

    public void setaTime(Time aTime) {
        this.aTime = aTime;
    }

    public Calendar getaCalendar() {
        return aCalendar;
    }

    public void setaCalendar(Calendar aCalendar) {
        this.aCalendar = aCalendar;
    }

    public Locale getaLocale() {
        return aLocale;
    }

    public void setaLocale(Locale aLocale) {
        this.aLocale = aLocale;
    }

    public byte[] getaByteArray() {
        return aByteArray;
    }

    public void setaByteArray(byte[] aByteArray) {
        this.aByteArray = aByteArray;
    }

    public UUID getAnUUID() {
        return anUUID;
    }

    public void setAnUUID(UUID anUUID) {
        this.anUUID = anUUID;
    }
}
