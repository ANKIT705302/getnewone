package com.niit.cloths.dao;

import java.util.List;

import com.niit.cloths.model.Category;

public interface CategoryRepository
{
	public boolean addCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(int categoryId);
	public List<Category> getAllCategory();
	public Category getCategoryById (int categoryId);
}
