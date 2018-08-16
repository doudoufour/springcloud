package organization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import organization.dao.OrganizationDaoServiceImpl;
import organization.po.Organization;

@Service
public class OrganizationServiceImpl implements OrganizationServiceInterface {
    @Autowired
    private OrganizationDaoServiceImpl organizationDaoServiceImpl;
    @Override
    public Organization getOrganizationByID(String id) {
        return organizationDaoServiceImpl.getOrganizationById(id);
    }

    @Override
    public void save(Organization organization) {
        organizationDaoServiceImpl.addOrganization(organization);
    }
}
