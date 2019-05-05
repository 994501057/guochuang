package global.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import global.mybatis.dto.Division;
import global.mybatis.mapper.DivisionMapper;
import global.web.service.DivisionService;

/**  
* @ClassName: DivisionServiceImpl  
* @Description: TODO(这里用一句话描述这个类的作用)
* @date 2018/10/25 16:56:57    
*    
*/
@Service
public class DivisionServiceImpl implements DivisionService{
	@Autowired
	private DivisionMapper divisionMapper;
	
	/**  
	* @Title: findDivisions  
	* @Description: 获得所有部门内容  
	* @return
	* @see global.web.service.DivisionService#findDivisions()
	*/
	@Override
	public List<Division> findDivisions(Division division) {
		// TODO Auto-generated method stub
		List<Division> findDivisions = divisionMapper.findDivisions(division);
		return findDivisions;
	}

	/**  
	* @Title: updateDivisionfromId  
	* @Description: 更改部门  
	* @param id
	* @param name
	* @param status
	* @param modified_by
	* @param modified_date
	* @see global.web.service.DivisionService#updateDivisionfromId(long, java.lang.String, java.lang.String, java.lang.String, java.util.Date)
	*/
	@Override
	@Transactional
	public void updateDivisionfromId(Division division) {
		// 判断是否有该数据
		List<Division> findDivisionfromId = divisionMapper.findDivisions(division);
		if (findDivisionfromId!=null||findDivisionfromId.size()>0) {
			divisionMapper.updateDivisionfromId(division);
		}
	}

	/**  
	* @Title: deleteDivisionfromId  
	* @Description: 通过ID删除部门  
	* @param id
	* @see global.web.service.DivisionService#deleteDivisionfromId(long)
	*/
	@Override
	@Transactional
	public void deleteDivisionfromId(Division division) {
		// 判断是否有该数据
				List<Division> findDivisions = divisionMapper.findDivisions(division);
				if (findDivisions!=null) {
					divisionMapper.deleteDivisionfromId(division.getId());
				}
	}

	/**  
	* @Title: addDivision  
	* @Description: 添加部门  
	* @param name
	* @param status
	* @param created_by
	* @param created_date
	* @param modified_by
	* @param modified_date
	* @see global.web.service.DivisionService#addDivision(java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.lang.String, java.util.Date)
	*/
	@Override
	@Transactional
	public void addDivision(Division division) {
		if (division.getStatus()==null) {
			division.setStatus("启用");
		}
		divisionMapper.addDivision(division);
	}

}
