package com.neuedu.dao;

import com.neuedu.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbggenerated
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbggenerated
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbggenerated
     */
    List<Category> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Category record);

    public List<Category> getChilds(@Param("parentId") Integer parentId);
    public List<Integer> getChildIds(@Param("parentId") Integer parentId);
    int updateName(@Param("name")String name,@Param("categoryId")Integer categoryId);

    List<Category> selectTopCategory(Integer sid);
}