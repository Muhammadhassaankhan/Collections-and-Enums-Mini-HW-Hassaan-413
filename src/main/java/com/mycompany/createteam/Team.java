
package com.mycompany.createteam;

import java.util.List;


public class Team {
    private String name;
    private List<Person> members;

    public Team(String name, List<Person> members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public List<Person> getMembers() {
        return members;
    }
}
