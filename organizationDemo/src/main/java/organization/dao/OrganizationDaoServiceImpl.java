package organization.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import organization.po.Organization;
import organization.repository.OrganizationRepository;

@Service
public class OrganizationDaoServiceImpl implements OrganizationDaoServiceInterface {
    @Autowired
    private OrganizationRepository organizationRepository;
    @Override
    public Organization getOrganizationById(String id) {
        return organizationRepository.findOne(id);
    }

    @Override
    public void addOrganization(Organization organization) {
        organizationRepository.save(organization);
    }
}
