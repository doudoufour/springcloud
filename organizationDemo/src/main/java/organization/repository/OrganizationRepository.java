package organization.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import organization.po.Organization;

import java.util.List;

public interface OrganizationRepository extends  CrudRepository<Organization, String> {
    @Query(value="select * from organization",nativeQuery = true)
    List<Organization> getAllUsers();
}
