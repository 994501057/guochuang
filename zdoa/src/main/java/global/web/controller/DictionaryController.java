package global.web.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.mybatis.dto.Dictionary;
import global.mybatis.dto.User;
import global.web.service.DictionaryService;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
	
	@Autowired
	private DictionaryService dictionaryService;
	
	/**
	 * @param map
	 * 查看所有
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping(method = RequestMethod.GET,value="/selectAllDictionary")
	public String exhibition(ModelMap map,Dictionary dictionary/*,  @RequestParam(required=true,defaultValue="1") Integer pageNum, @RequestParam(required=false,defaultValue="10")  Integer pageSize*/){

//		if (pageNum == null || pageNum == 0) {
//			pageNum = 1;
//		}
		//设定开始页数和分页条数
		// PageHelper.startPage(pageNum, pageSize);
		 List<Dictionary> finddictionary = dictionaryService.finddictionary(dictionary);
		//分页开始
		//PageInfo pageInfo = new PageInfo(finddictionary);
		//获取总页数Stgring
		//int pageCount = pageInfo.getPages();
		//map.addAttribute("pageCount",pageCount);
		map.addAttribute("dictionarylist",finddictionary);
		 //返回的相应页面
		return "dictionary/demoDictionary";
	}
	
	/**
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * 添加字段
	 */
	@RequestMapping(method = RequestMethod.POST,value="/adddictionary")
	public String adddictionary(Dictionary dictionary,ModelMap map) {
		//获取当前时间
		Date day = new Date();
		dictionary.setCreated_date(day);
		//获取用户信息
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		dictionary.setCreated_by(user.getUsername());
		
		try {
			dictionaryService.addDictionary(dictionary); 
		} catch (Exception e) {
			e.getMessage();
			map.put("message", "字典获取失败");
			exhibition(map, null);
			//输入网址
			return "dictionary/demoDictionary";
		}
		//回顯數據
		exhibition(map, null);
		//返回的相应页面
		return "dictionary/demoDictionary";
	}
	
	/**
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException
	 * 修改字典 
	 */
	@RequestMapping(method = RequestMethod.POST,value="/updatedictionary/{id}")
	public String updatedictionary(Dictionary dictionary,ModelMap map){
		System.out.println(dictionary.getCode());
		System.out.println(dictionary.getName());
		System.out.println(dictionary.getIntroduction());
		//获取用户信息
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		dictionary.setModified_by(user.getUsername());
		//获取当前时间
		Date day = new Date();
		dictionary.setModified_date(day);
		try {
			dictionaryService.updateDictionary(dictionary);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map.put("message", "字典修改失败");
			exhibition(map, null);
			//输入网址
			return "dictionary/demoDictionary";
		}
		//回顯數據
		exhibition(map, null);
		//返回的相应页面
		return "dictionary/demoDictionary";
	}
	
	
	/**  
	* @Title: deleteDictionaryforid  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param request
	* @param response
	* @throws ServletException
	* @throws IOException 
	* 删除单个   
	*/
	@RequestMapping(method = RequestMethod.GET,value="/deleteDictionaryforid/{id}")
	public String deleteDictionaryforid(Dictionary dictionary,ModelMap map){
		//调用删除
		try {
			dictionaryService.deleteDictionary(dictionary.getId());
		} catch (Exception e) {
			e.getMessage();
			map.put("message", "字典删除失败");
			exhibition(map, null);
			//输入网址
			return "dictionary/demoDictionary";
		}
		//回顯數據
		exhibition(map, null);
		//返回的相应页面
		return "dictionary/demoDictionary";
	}
	
	/**  
	* @Title: deleteDictionarylist  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param request
	* @param response
	* @throws ServletException
	* @throws IOException 
	* 删除多个   
	*/
	@RequestMapping(method = RequestMethod.GET,value="/deleteDictionarys")
	public String deleteDictionarylist(String[] dictionaries,ModelMap map){
			if (dictionaries != null) {
				for (String dictionarie : dictionaries) {
					Long id = Long.valueOf(dictionarie);
					dictionaryService.deleteDictionary(id);
				}
			}else {
				map.put("message", "字典删除失败");
				exhibition(map, null);
				//输入网址
				return "dictionary/demoDictionary";
			}
			//回顯數據
			exhibition(map, null);
			//返回的相应页面
			return "dictionary/demoDictionary";
	}
	
	/**
	 * @param map
	 * 查看单个对象
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping(method = RequestMethod.GET,value="/selectDictionary/{id}")
	public String dictionaryById(ModelMap map,Dictionary dictionary){
		try {
			Dictionary dictionary2 = dictionaryService.dictionaryById(dictionary.getId());
			System.out.println(dictionary2.getId()+"dictionary");
			map.addAttribute("dictionary",dictionary2);
		} catch (Exception e) {
			e.getMessage();
			map.put("message", "字典无此数据");
			exhibition(map, null);
			 //返回的相应页面
			return "dictionary/demoDictionary";
		}
		
		 //返回的相应页面
		return "dictionary/demoUpdateDictionary";
	}
}
