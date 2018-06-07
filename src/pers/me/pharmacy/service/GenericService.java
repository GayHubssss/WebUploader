package pers.me.pharmacy.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import pers.me.pharmacy.util.PagedList;

/**
 * 泛型接口（完成增删改查操作）
 * 
 * @author Administrator
 * 
 * @param <T>
 * @param <PK>
 */
public interface GenericService<T, PK extends Serializable> {
	void add(T t);

	void update(T t);

	void delete(PK id);

	void delete(String[] ids);

	T find(PK id);

	T findByName(String name);

	PagedList<T> findPage(int pageIndex, int pageSize);
	
	// 根据指定条件和顺序返回一页数据
    PagedList<T> findPageByCondition(Map<String,Object> map);
	
	
	List<T> findAll();
}
