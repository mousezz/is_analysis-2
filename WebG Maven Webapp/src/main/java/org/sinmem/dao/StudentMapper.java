package org.sinmem.dao;

import org.sinmem.bean.Student;
import org.sinmem.service.UserService;

public interface StudentMapper extends UserMapper<Student>{

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String userid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated
	 */
	int insert(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated
	 */
	int insertSelective(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated
	 */
	Student selectByPrimaryKey(String userid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Student record);
}