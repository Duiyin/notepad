package com.tinghan.notepad.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tinghan.notepad.domain.User;

@Component
@Transactional
public class UserDao extends BaseDao<User>{
	
	// save user
	public void save(User user) {
		getSession().save(user);
	}
	
	/**
	 * 查找是否有重复账号
	 * @param id
	 * @return
	 */
	public User getOneById(String account){
		try {
			DetachedCriteria dc = DetachedCriteria.forClass(User.class);
			Disjunction dis = Restrictions.disjunction();
			dis.add(Property.forName("account").eq(account));
			dis.add(Property.forName("email").eq(account));
			dis.add(Property.forName("idcard").eq(account));
			dc.add(dis);
			List<User> list = findAllByCriteria(dc);
			try {
				return list.get(0);
			} catch (Exception e) {
				return null;
			}
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}
}
