package organization.service;

import organization.po.Organization;;

public interface OrganizationServiceInterface {
    Organization getOrganizationByID(String id);
    void save(Organization user);
}
