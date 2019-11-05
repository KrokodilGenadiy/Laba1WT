package com.company;

import java.util.List;

public abstract class DAO <E>{
    public abstract List<E> getAll();
    public abstract E update(E entity);
    public abstract  boolean delete(E entity);
    public abstract boolean create(E entity);

}