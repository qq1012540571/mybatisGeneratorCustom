package org.wcy.gen.mapper;

import org.wcy.gen.model.ZmTaobaocoupon;

public interface ZmTaobaocouponMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ZmTaobaocoupon record);

    int insertSelective(ZmTaobaocoupon record);

    ZmTaobaocoupon selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZmTaobaocoupon record);

    int updateByPrimaryKey(ZmTaobaocoupon record);
}