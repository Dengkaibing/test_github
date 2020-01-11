package com.imagine.dragons.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.imagine.dragons.Exception.BusinessException;
import com.imagine.dragons.constant.ErrorConstant;
import com.imagine.dragons.entity.TUsers;
import com.imagine.dragons.mapper.TUsersMapper;
import com.imagine.dragons.service.ITUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imagine.dragons.util.TaleUtils;
import freemarker.template.utility.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
@Service
public class TUsersServiceImpl extends ServiceImpl<TUsersMapper, TUsers> implements ITUsersService {
   private static final Logger logger= LoggerFactory.getLogger(TUsersServiceImpl.class);
    @Autowired
    private TUsersMapper usersMapper;

    @Override
    public TUsers login(String username, String pass) {
        if (StringUtils.isBlank(username) || StringUtils.isBlank(pass))
            throw new BusinessException(ErrorConstant.Auth.USERNAME_PASSWORD_IS_EMPTY);

        String pwd = TaleUtils.MD5encode(username + pass);
        System.out.println("加密后pwd:"+pwd);
        QueryWrapper<TUsers> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username).eq("password", pwd);
        TUsers user = usersMapper.selectOne(wrapper);
        if(user==null)
            throw new BusinessException(ErrorConstant.Auth.USERNAME_PASSWORD_ERROR);
        return user;
    }
}
