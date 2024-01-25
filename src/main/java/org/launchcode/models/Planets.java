package org.launchcode.models;

import java.util.HashMap;

public enum Planets {
    MERCURY("Mercury"),
    VENUS("Venus"),
    EARTH("Earth"),
    MARS("Mars"),
    JUPITER("Jupiter"),
    SATURN("Saturn"),
    URANUS("Uranus"),
    NEPTUNE("Neptune"),
    ;
    private final String name;

    Planets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final Map<String, int> yearLength = New HashMap<>;
    yearLength.put("Mercury", 88);
    yearLength.put("Venus", 225);
    yearLength.put("Earth", 365);
    yearLength.put("Mars", 687);
    yearLength.put("Jupiter", 4333);
    yearLength.put("Saturn", 10759);
    yearLength.put("Uranus", 30687);
    yearLength.put("Neptune", 60200);

    public Map<String, int> getYearLength() {
        return yearLength;
    }
}
