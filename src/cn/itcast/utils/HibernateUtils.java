package cn.itcast.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	static Configuration configuration = null;
	static SessionFactory sessionFactory = null;
	//静态代码块实现
	static {
		//加载核心配置文件
		configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
	}
	
	//提供返回与本地线程帮的session的方法
	public static Session getSessionObject() {
		return sessionFactory.getCurrentSession();
	}
	
	//提供方法返回sessionFactory
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
