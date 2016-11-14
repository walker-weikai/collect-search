package com.baseinfo.collect.dao;

import com.baseinfo.collect.beans.UserBean;

/**
 * 用户相关的Dao层接口
 */
public interface UserDao {

    public int insert(UserBean user) throws Exception;

    public int update(UserBean user) throws Exception;

    public UserBean select(UserBean user) throws Exception;

    public int delete(long id) throws  Exception;

    public UserBean selectUserByUnameAndPwd(String uname,long id) throws Exception;


}
