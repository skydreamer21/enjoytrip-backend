package com.discovero.enjoytrip.plan.model;

import java.util.List;

import com.discovero.enjoytrip.attraction.model.AttractionDto;

public interface IPlanService {

	List<UserScheduleDto> getMyPlan(String user_id);
	
	List<AttractionDto> getAttractionList(int plan_id);

	UserScheduleDto getDetail(int schedule_id);
	
}
