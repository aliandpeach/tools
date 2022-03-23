package com.tool.doge.service;

import com.tool.doge.mapper.IDownloadCategoriesMapper;
import com.tool.doge.model.Category;
import com.tool.doge.model.DownloadCategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 11:47:35
 */
@Service
public class DownloadCategoriesService
{
    @Autowired
    private IDownloadCategoriesMapper downloadCategoriesMapper;

    public int saveDownloadCategories(DownloadCategories downloadCategories)
    {
        return downloadCategoriesMapper.saveDownloadCategories(downloadCategories);
    }

    @Transactional
    public int saveDownloadCategoriesList(List<DownloadCategories> downloadCategoriesList)
    {
        if (null == downloadCategoriesList || downloadCategoriesList.size() == 0)
        {
            return 0;
        }
        return downloadCategoriesMapper.saveDownloadCategoriesList(downloadCategoriesList);
    }

    public int updateDownloadCategories(DownloadCategories downloadCategories)
    {
        return downloadCategoriesMapper.updateDownloadCategories(downloadCategories);
    }

    public List<DownloadCategories> selectDownloadCategories(int limit)
    {
        return downloadCategoriesMapper.selectDownloadCategories(limit);
    }

    public int saveCategoryList(List<Category> categoryList)
    {
        return downloadCategoriesMapper.saveCategoryList(categoryList);
    }

    public int saveCategory(Category category)
    {
        return downloadCategoriesMapper.saveCategory(category);
    }

    public List<Category> selectCategoryList()
    {
        return downloadCategoriesMapper.selectCategoryList();
    }

    public int updateLatestUrlByType(String type, String latestUrl)
    {
        return downloadCategoriesMapper.updateLatestUrlByType(type, latestUrl);
    }

    public int updateLatestPageByType(int page, String latestUrl)
    {
        return downloadCategoriesMapper.updateLatestPageByType(page, latestUrl);
    }
}
