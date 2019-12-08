package top.aiplant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbUserMapper;
import top.aiplant.entity.TbUser;
import top.aiplant.entity.TbUserExample;
import top.aiplant.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private TbUserMapper userMapper;

    @Override
    public List<TbUser> getUserList() {
    	TbUserExample userExample = new TbUserExample();
        return userMapper.selectByExample(userExample);
    }
}
