package com.target.cab.service;

import com.target.cab.model.Cab;
import com.target.cab.model.DropPointsList;
import com.target.cab.model.RoutePlan;
import com.target.cab.model.TeamMember;

public interface CabService {

    public void registerTM(TeamMember teamMember);

    public void registerCab(Cab cab);

    public void addDropPoints(DropPointsList dropPointList);

    public RoutePlan getRoutePlan();

}
