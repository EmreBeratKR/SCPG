package com.maltepe.scpg.business.concretes;

import com.maltepe.scpg.business.abstracts.IProductService;
import com.maltepe.scpg.dataAccess.abstracts.IProductDao;
import com.maltepe.scpg.entities.concretes.Product;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductManager implements IProductService
{
    private final IProductDao productDao;


    @Override
    public List<Product> getAll()
    {
        return this.productDao.findAll();
    }

    @Override
    public Product getById(int id)
    {
        return this.productDao.getById(id);
    }

    @Override
    public List<Product> getByName(String name)
    {
        return this.productDao.getAllByProductName(name);
    }

    @Override
    public List<Product> getByNameContains(String name)
    {
        return this.productDao.getAllByProductNameContains(name);
    }
}
