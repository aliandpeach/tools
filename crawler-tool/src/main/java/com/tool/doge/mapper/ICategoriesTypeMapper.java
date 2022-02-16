package com.tool.doge.mapper;

import com.tool.doge.model.CategoriesType;

import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2022/02/08 11:01:36
 */
public interface ICategoriesTypeMapper
{
    int saveCategoriesTypeList(List<CategoriesType> categoriesTypeList);

    int saveCategoriesType(CategoriesType categoriesType);

    List<CategoriesType> selectCategoriesTypeList();

    int updateLatestUrlByType(String type, String latestUrl);
    int updateLatestPageByType(int page, String latestUrl);
}
