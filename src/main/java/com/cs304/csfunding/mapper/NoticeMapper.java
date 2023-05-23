package com.cs304.csfunding.mapper;

import com.cs304.csfunding.entity.Apply;
import com.cs304.csfunding.entity.Notice;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface NoticeMapper {
    @Insert("insert into notice(content, Time, noticefrom, noticeto) values " + "(#{content}, #{Time}, #{noticefrom}, #{noticeto})")
    void addNotice(Notice notice);

    @Select("select * from notice")
    List<Notice> getAllNotice();

    @Select("select * from notice where UUID = #{UUID}")
    Notice queryNoticeByID(@Param("UUID") int uuid);

    @Select("select * from notice where noticeto = #{noticeTo} or noticeto = -1")
    List<Notice> queryNoticeByNoticeTo(@Param("noticeTo") int noticeTo);

    @Select("select * from notice where noticeFrom = #{noticeFrom}")
    List<Notice> queryNoticeByNoticeFrom(@Param("noticeFrom") int noticeFrom);

    @Delete("delete from notice where uuid = #{uuid}")
    void deleteNotice(int uuid);
}
