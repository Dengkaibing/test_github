package com.imagine.dragons.service;

import com.imagine.dragons.entity.TUsers;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-01-06
 */
public interface ITUsersService extends IService<TUsers> {
    public TUsers login(String username,String pass);

}
