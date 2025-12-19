package com.zomato.dao;

import com.zomato.dto.ZomatoDto;

public interface ZomatoDao {
    boolean saveRest(ZomatoDto zomatoDto);
    boolean duplicate(ZomatoDto zomatoDto);
}
