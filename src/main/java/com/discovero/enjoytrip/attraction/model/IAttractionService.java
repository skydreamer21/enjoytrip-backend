package com.discovero.enjoytrip.attraction.model;

import java.util.List;

public interface IAttractionService {

	List<AttractionDto> searchAttractionList(AttractionSearchDto asDto);

}
