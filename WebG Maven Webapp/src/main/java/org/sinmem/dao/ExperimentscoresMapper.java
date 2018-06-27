package org.sinmem.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.sinmem.bean.Experimentscores;

public interface ExperimentscoresMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table experimentscores
	 * @mbggenerated
	 */int deleteByPrimaryKey(@Param("experimentscoresno") String experimentscoresno,@Param("experimentno") String experimentno);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table experimentscores
	 * @mbggenerated
	 */
	int insert(Experimentscores record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table experimentscores
	 * @mbggenerated
	 */
	int insertSelective(Experimentscores record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table experimentscores
	 * @mbggenerated
	 */Experimentscores selectByPrimaryKey(@Param("experimentscoresno") String experimentscoresno,@Param("experimentno") String experimentno);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table experimentscores
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Experimentscores record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table experimentscores
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Experimentscores record);
	
	ArrayList<Experimentscores> getES_WLPkForSt(@Param("fKey")String fKey);
}