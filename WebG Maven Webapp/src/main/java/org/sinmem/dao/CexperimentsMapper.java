package org.sinmem.dao;

import org.apache.ibatis.annotations.Param;
import org.sinmem.bean.Cexperiments;

public interface CexperimentsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cexperiments
	 * @mbggenerated
	 */int deleteByPrimaryKey(@Param("experimentscoresno") String experimentscoresno,@Param("experimentno") String experimentno);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cexperiments
	 * @mbggenerated
	 */
	int insert(Cexperiments record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cexperiments
	 * @mbggenerated
	 */
	int insertSelective(Cexperiments record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cexperiments
	 * @mbggenerated
	 */Cexperiments selectByPrimaryKey(@Param("experimentscoresno") String experimentscoresno,@Param("experimentno") String experimentno);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cexperiments
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Cexperiments record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cexperiments
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Cexperiments record);
}