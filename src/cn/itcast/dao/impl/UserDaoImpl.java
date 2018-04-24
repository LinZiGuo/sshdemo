package cn.itcast.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.itcast.dao.UserDao;
import cn.itcast.entity.User;

public class UserDaoImpl implements UserDao {

	//得到hibernateTemplate对象
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	public void add() {
		//hibernateTemplate对hibernate进行封装
//		HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
//		hibernateTemplate.save(entity);
		
//		User user = new User();
//		user.setUsername("Lin");
//		user.setAddress("番禺");
//		//调用save方法实现添加
//		hibernateTemplate.save(user);
		
		//get方法：根据id查询
//		User user = hibernateTemplate.get(User.class, 2);
//		System.out.println(user.getUsername()+":"+user.getAddress());
		
		//find方法：查询所有记录
//		List<User> users = (List<User>) hibernateTemplate.find("from User");
//		for (User user : users) {
//			System.out.println(user.getUsername()+":"+user.getAddress());
//		}
		
		//find方法：条件查询
		List<User> users = (List<User>) hibernateTemplate.find("from User where username=?","Lin");
		for (User user : users) {
			System.out.println(user.getUsername()+":"+user.getAddress());
		}
	}
	
//	private void get() {
//		User user = hibernateTemplate.get(User.class, 2);
//		System.out.println(user.getUsername()+":"+user.getAddress());
//	}

}
