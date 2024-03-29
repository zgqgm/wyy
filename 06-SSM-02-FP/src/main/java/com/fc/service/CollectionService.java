package com.fc.service;

import com.fc.entity.Collection;
import com.fc.vo.ResultVo;

public interface CollectionService {
    ResultVo add(Collection collection);

    ResultVo del(Long id);

    ResultVo list(Integer pageNo, Integer pageSize,String name);

    ResultVo update(Collection collection);
}
