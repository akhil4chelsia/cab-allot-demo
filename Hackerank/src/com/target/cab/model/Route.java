package com.target.cab.model;

public class Route {

    private String cabId;
    private String teamMemberIds;
    private String route;
    private String routeCost;

    public String getCabId() {
        return this.cabId;
    }

    public void setCabId(String cabId) {
        this.cabId = cabId;
    }

    public String getTeamMemberIds() {
        return this.teamMemberIds;
    }

    public void setTeamMemberIds(String teamMemberIds) {
        this.teamMemberIds = teamMemberIds;
    }

    public String getRoute() {
        return this.route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getRouteCost() {
        return this.routeCost;
    }

    public void setRouteCost(String routeCost) {
        this.routeCost = routeCost;
    }

}
