package com.szhqfy.gov.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
	Map queryMapById(String string);
	List<Map> test(String string);
}
