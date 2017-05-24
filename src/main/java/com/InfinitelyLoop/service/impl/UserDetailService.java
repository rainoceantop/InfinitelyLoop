package com.InfinitelyLoop.service.impl;

import com.InfinitelyLoop.dao.UserDetailMapper;
import com.InfinitelyLoop.pojo.UserDetail;
import com.InfinitelyLoop.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements CommonService<UserDetail> {
    @Autowired
    private UserDetailMapper userDetailMapper;

    public int deleteByPrimaryKey(Integer primaryKey) {
        return userDetailMapper.deleteByPrimaryKey(primaryKey);
    }

    public int insert(UserDetail record) {
        return userDetailMapper.insert(record);
    }

    public int insertSelective(UserDetail record) {
        return userDetailMapper.insertSelective(record);
    }

    public UserDetail selectByPrimaryKey(Integer commentId) {
        return userDetailMapper.selectByPrimaryKey(commentId);
    }

    public int updateByPrimaryKeySelective(UserDetail record) {
        return userDetailMapper.updateByPrimaryKeySelective(record);
    }
    public int updateByPrimaryKey(UserDetail record) {
        return userDetailMapper.updateByPrimaryKey(record);
    }

}