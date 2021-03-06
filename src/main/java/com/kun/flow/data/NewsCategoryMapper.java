package com.kun.flow.data;

import com.kun.flow.model.NewsCategory;
import com.kun.flow.model.NewsCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface NewsCategoryMapper extends IMapper<NewsCategory> {
    int countByExample(NewsCategoryExample example);

    int deleteByExample(NewsCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NewsCategory record);

    int insertSelective(NewsCategory record);

    List<NewsCategory> selectByExample(NewsCategoryExample example);
    List<NewsCategory> listRoot();
    List<NewsCategory> listRootPremission(@Param("key") Long userid);
    List<NewsCategory> listByPid(@Param("key") Long pid);
    List<NewsCategory> listByPidPremission(@Param("map") Map<String, Object> map);

    NewsCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NewsCategory record, @Param("example") NewsCategoryExample example);

    int updateByExample(@Param("record") NewsCategory record, @Param("example") NewsCategoryExample example);

    int updateByPrimaryKeySelective(NewsCategory record);

    int updateByPrimaryKey(NewsCategory record);
}