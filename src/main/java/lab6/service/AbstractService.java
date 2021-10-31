package lab6.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractService<T, ID> {
    protected abstract JpaRepository<T, ID> getRepository();

    public List<T> getAll() {
        return getRepository().findAll();
    }

    public T getById(ID id) {
        return getRepository().getById(id);
    }

    public T create(T object) {
        return getRepository().save(object);
    }

    public T update(ID id, T object) {
        if (getRepository().findById(id).isPresent()) {
            return getRepository().save(object);
        } else {
            return null;
        }
    }

    public void deleteById(ID id) {
        if (getRepository().findById(id).isPresent()) {
            getRepository().deleteById(id);
        }
    }
}
