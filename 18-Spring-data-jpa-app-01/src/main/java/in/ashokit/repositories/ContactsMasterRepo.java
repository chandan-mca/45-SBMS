package in.ashokit.repositories;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import in.ashokit.entities.ContactsMasterEntity;

public interface ContactsMasterRepo 
	extends CrudRepository<ContactsMasterEntity, Serializable> {

}
