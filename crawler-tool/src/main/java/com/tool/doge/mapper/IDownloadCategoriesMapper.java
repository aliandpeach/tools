package com.tool.doge.mapper;

import com.tool.doge.model.Category;
import com.tool.doge.model.DownloadCategories;

import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2022/02/08 11:01:36
 */
public interface IDownloadCategoriesMapper
{
    int saveDownloadCategories(DownloadCategories downloadCategories);

    int saveDownloadCategoriesList(List<DownloadCategories> downloadCategoriesList);

    int updateDownloadCategories(DownloadCategories downloadCategories);

    List<DownloadCategories> selectDownloadCategories(int limit);

    int saveCategoryList(List<Category> categoryList);

    int saveCategory(Category category);

    List<Category> selectCategoryList();

    int updateLatestUrlByType(String type, String latestUrl);

    int updateLatestPageByType(int page, String latestUrl);
}
