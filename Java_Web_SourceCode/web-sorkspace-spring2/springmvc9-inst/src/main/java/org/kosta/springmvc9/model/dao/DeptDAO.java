package org.kosta.springmvc9.model.dao;

import java.util.List;

import org.kosta.springmvc9.model.vo.DeptVO;

public interface DeptDAO {

	int getDeptCount();

	List<DeptVO> getAllDeptList();

}