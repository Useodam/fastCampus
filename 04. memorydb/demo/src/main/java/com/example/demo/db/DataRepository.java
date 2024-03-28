package com.example.demo.db;

import java.util.List;
import java.util.Optional;

public interface DataRepository<T, ID> extends Repository<T, ID> {

    // create, update
    T save(T data);

    Optional<T> findById(ID id);
    List<T> findAll();

    void delete(ID id);
}
