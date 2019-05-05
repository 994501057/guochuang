package global.mybatis.mapper;

import java.util.List;

import global.mybatis.dto.Dictionary;

public interface DictionaryMapper {
	/**
	 * 获得所有信息
	 * 通过名字查询
	 * 通过id查询
	 * @return
	 */
	List<Dictionary> finddictionary(Dictionary dictionary);
	
	/**
	 * @param id
	 * @param code
	 * @param name
	 * @param introduction
	 * @param modified_by
	 * @param modified_date
	 * @return 是否成功
	 * 修改信息
	 */
	void updateDictionary (Dictionary dictionary);
	
	/**
	 * @param id
	 * @return
	 * 删除
	 */
	void deleteDictionary (Long id);
	
	/**
	 * @param id
	 * @param code
	 * @param name
	 * @param introduction
	 * @param created_by
	 * @param created_date
	 * @return
	 * 
	 */
	void addDictionary(Dictionary dictionary);
	
	/**  
	* @Title: dictionary  
	* @Description: 查询单个词条
	* @param id
	* @return    
	*/
	Dictionary dictionaryById (Long id);
	
}
