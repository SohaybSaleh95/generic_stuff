package daos;

import entities.IEntity;

import java.util.List;

public interface IDao
{
    void create(IEntity aInIEntity);

    void update(IEntity aInIEntity);

    void delete(IEntity aInIEntity);

    List<IEntity> getList();

    IEntity getRecord(String aInId);
}