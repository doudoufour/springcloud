package organization.dao;

import organization.po.Organization;

public interface OrganizationDaoServiceInterface {
    Organization getOrganizationById(String id);
    void addOrganization(Organization user);
}
