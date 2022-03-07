package com.company;

public enum DaysOfWeek {

    MONDAY("Дуйшомбу куну Жава сабагы"),
    TUESDAY("Шейшемби куну Soft Skills сабагы"),
    WEDNASDAY("Шаршемби куну практика сабагы"),
    THURSDAY("Бейшемби куну Англис тил сабагы"),
    FRIDAY("Жума куну Жава сабагы"),
    SATURDAY("Ишемби куну дем алыш"),
    SUNDAY("Жекшемби дуйшомбуго даярдануу куну");

    private String days;

    DaysOfWeek(String days) {
        this.days = days;
    }

    public String getDays() {
        return days;
    }
}

