package com.cs304.csfunding.mapper;

import com.cs304.csfunding.api.User_ResearchGroupDTO;
import com.cs304.csfunding.entity.ResearchGroup_Fund;
import com.cs304.csfunding.entity.User;
import com.cs304.csfunding.entity.User_ResearchGroup;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ResearchGroup_FundMapper {

    @Insert("insert into researchgroup_fund(ResearchGroup_UUID, Fund_UUID) values (#{ResearchGroup_UUID}, #{Fund_UUID})")
    void addResearchGroup_Fund(ResearchGroup_Fund researchGroup_fund);




}
