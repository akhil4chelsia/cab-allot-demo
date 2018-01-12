package com.target.cab.dao;

import java.util.List;

import com.target.cab.model.Cab;
import com.target.cab.model.DropPoint;
import com.target.cab.model.TeamMember;

public interface CabRepository {

    public List<TeamMember> findAllTeamMembers();

    public List<Cab> findAllCabs();

    public List<DropPoint> findAllDropPoints();

    public void upsertTeamMember(TeamMember teamMember);

    public void upsertCab(Cab cab);

    public void upsertDropPoints(List<DropPoint> dropPoints);

}
