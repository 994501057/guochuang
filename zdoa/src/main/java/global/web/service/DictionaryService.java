package global.web.service;

import java.util.List;

import global.mybatis.dto.Dictionary;

public interface DictionaryService {
	/**
	 * 获得所有信息
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
	void deleteDictionary (long id);
	
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
	* @Title: dictionaryById  
	* @Description: 通过id来获得
	* @param id
	* @return    
	*/
	Dictionary dictionaryById (Long id);

}
