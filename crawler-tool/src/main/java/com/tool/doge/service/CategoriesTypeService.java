package com.tool.doge.service;

import com.tool.doge.mapper.ICategoriesTypeMapper;
import com.tool.doge.mapper.IHostMapper;
import com.tool.doge.model.CategoriesType;
import com.tool.doge.model.Host;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 11:47:35
 */
@Service
public class CategoriesTypeService
{
    @Autowired
    private ICategoriesTypeMapper categoriesTypeMapper;

    public int saveCategoriesTypeList(List<CategoriesType> categoriesTypeList)
    {
        return categoriesTypeMapper.saveCategoriesTypeList(categoriesTypeList);
    }

    public int saveCategoriesType(CategoriesType categoriesType)
    {
        return categoriesTypeMapper.saveCategoriesType(categoriesType);
    }

    public List<CategoriesType> selectCategoriesTypeList()
    {
        return categoriesTypeMapper.selectCategoriesTypeList();
    }

    public int updateLatestUrlByType(String type, String latestUrl)
    {
        return categoriesTypeMapper.updateLatestUrlByType(type, latestUrl);
    }

    public int updateLatestPageByType(int page, String latestUrl)
    {
        return categoriesTypeMapper.updateLatestPageByType(page, latestUrl);
    }
}
