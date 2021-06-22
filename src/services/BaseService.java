package services;

import daos.IDao;
import entities.IEntity;

import java.util.List;

public class BaseService
{
    protected IDao entityDao;

    public void createEntity(IEntity aInIEntity)
    {
        entityDao.create(aInIEntity);
    }

    public void updateEntity(IEntity aInIEntity)
    {
        entityDao.update(aInIEntity);
    }

    public void deleteEntity(IEntity aInIEntity)
    {
        entityDao.delete(aInIEntity);
    }

    public List<IEntity> getList()
    {
        return entityDao.getList();
    }

    public IEntity getRecord(String aInId)
    {
        return entityDao.getRecord(aInId);
    }

    public void setEntityDao(IDao aInEntityDao)
    {
        entityDao = aInEntityDao;
    }
}
