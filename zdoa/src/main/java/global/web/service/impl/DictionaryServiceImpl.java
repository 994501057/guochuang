package global.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import global.mybatis.dto.Dictionary;
import global.mybatis.mapper.DictionaryMapper;
import global.web.service.DictionaryService;

@Service
public class DictionaryServiceImpl implements DictionaryService{
	@Autowired
	private DictionaryMapper dictionaryMapper;

	/**  
	* @Title: finddictionary  
	* @Description: 通过条件查询  
	* @param dictionary
	* @return
	* @see global.web.service.DictionaryService#finddictionary(global.mybatis.dto.Dictionary)
	*/
	@Override
	@Transactional
	public List<Dictionary> finddictionary(Dictionary dictionary) {
		//获取相应的对象
		List<Dictionary> finddictionary = dictionaryMapper.finddictionary(dictionary);
		return finddictionary;
	}

	/**  
	* @Title: updateDictionary  
	* @Description: 修改字典 
	* @param dictionary
	* @see global.web.service.DictionaryService#updateDictionary(global.mybatis.dto.Dictionary)
	*/
	@Override
	@Transactional
	public void updateDictionary(Dictionary dictionary) {
		//修改相应的对象
		dictionaryMapper.updateDictionary(dictionary);
	}

	/**  
	* @Title: deleteDictionary  
	* @Description: 删除对应的对象
	* @param dictionary
	* @see global.web.service.DictionaryService#deleteDictionary(global.mybatis.dto.Dictionary)
	*/
	@Override
	@Transactional
	public void deleteDictionary(long id) {
		//删除对应的对象
		dictionaryMapper.deleteDictionary(id);
	}

	/**  
	* @Title: addDictionary  
	* @Description: 创建字典  
	* @param dictionary
	* @see global.web.service.DictionaryService#addDictionary(global.mybatis.dto.Dictionary)
	*/
	@Override
	@Transactional
	public void addDictionary(Dictionary dictionary) {
		//创建字典  
		dictionaryMapper.addDictionary(dictionary);
	}

	/**  
	* @Title: dictionaryById  
	* @Description: 根据id查对象  
	* @param id
	* @return
	* @see global.web.service.DictionaryService#dictionaryById(java.lang.Long)
	*/
	@Override
	public Dictionary dictionaryById(Long id) {
		Dictionary dictionary = dictionaryMapper.dictionaryById(id);
		return dictionary;
	}
	

}
