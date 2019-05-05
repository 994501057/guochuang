package global.help;

import java.util.List;
public class PageBean<t> {
// 当前页
private Integer currentPage ;
// 每页显示的总条数
private Integer pageSize ;
// 总条数
private Integer totalNum;
// 是否有下一页
private Integer isMore;
// 总页数
private Integer totalPage;
// 开始索引
private Integer startIndex;
// 分页结果
private List<t> User;
private List<t> Project_table;
public List<t> getProject_table() {
	return Project_table;
}

public void setProject_table(List<t> project_table) {
	Project_table = project_table;
}

public Integer getCurrentPage() {
	return currentPage;
}

public PageBean() {
    super();
}

public PageBean(Integer currentPage, Integer pageSize, Integer totalNum) {
    super();
    this.currentPage = currentPage;
    this.pageSize = pageSize;
    this.totalNum = totalNum;
    this.totalPage = (this.totalNum+this.pageSize-1)/this.pageSize;
    this.startIndex = (this.currentPage-1)*this.pageSize;
    this.isMore = this.currentPage >= this.totalPage?0:1;
}
public void setCurrentPage(Integer currentPage) {
	this.currentPage = currentPage;
}
public Integer getPageSize() {
	return pageSize;
}
public void setPageSize(Integer pageSize) {
	this.pageSize = pageSize;
}
public Integer getTotalNum() {
	return totalNum;
}
public void setTotalNum(Integer totalNum) {
	this.totalNum = totalNum;
}
public Integer getIsMore() {
	return isMore;
}
public void setIsMore(Integer isMore) {
	this.isMore = isMore;
}
public Integer getTotalPage() {
	return totalPage;
}
public void setTotalPage(Integer totalPage) {
	this.totalPage = totalPage;
}
public Integer getStartIndex() {
	return startIndex;
}
public void setStartIndex(Integer startIndex) {
	this.startIndex = startIndex;
}
public List<t> getUser() {
	return User;
}
public void setUser(List<t> user) {
	User = user;
}





}
	

