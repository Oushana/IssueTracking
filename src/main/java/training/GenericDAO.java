package training;

import java.io.Serializable;

/**
 * Created by Oksana_Eryomenko on 4/18/2016.
 */
public interface GenericDAO<T, PK extends Serializable> {

    /** Persist the newInstance object into database */
    T create(T newInstance);

    /** Retrieve an object that was previously persisted to the database using
     *   the indicated id as primary key
     */
    T read(T id);

    /** Save changes made to a persistent object.  */
    void update(T transientObject);

    /** Remove an object from persistent storage in the database */
    void delete(T persistentObject);
}