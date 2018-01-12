package com.target.cab.model;

public class TeamMember {

    private String teamMemberId;
    private String gender;
    private DropPoint dropPoint;

    public String getTeamMemberId() {
        return this.teamMemberId;
    }

    public void setTeamMemberId(String teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public DropPoint getDropPoint() {
        return this.dropPoint;
    }

    public void setDropPoint(DropPoint dropPoint) {
        this.dropPoint = dropPoint;
    }
}
