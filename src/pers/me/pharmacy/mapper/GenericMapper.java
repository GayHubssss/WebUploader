package pers.me.pharmacy.mapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

/**
 * 实现基本的增删改查功能（包含分页，不包含条件查询）
 * 
 * @author Administrator
 * @param <T>
 * @param <PK>
 */
public interface GenericMapper<T, PK extends Serializable> {
	
	void add(T t);

	void update(T t);

	void delete(PK id);

	T find(PK id);

	T findByName(String name);
	//获取总记录数
	long totalCount();
	//获取一页的数据
	
	List<T> findPage(@Param("firstResult") int firstResult,
			@Param("maxResult") int maxResult);
	
	List<T> findAll();
	
	
	// 根据指定条件获取记录数，用于分页
	 long totalCountByGraduteStudent(Map<String,Object> map);

	// 根据指定条件和顺序返回一页数据
	 List<T> findPageByCondition(Map<String,Object> map);
}
