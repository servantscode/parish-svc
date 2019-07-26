package org.servantscode.parish;

public class Department {
    private int id;
    private String name;
    private int departmentHeadId;
    private int orgId;

    public Department() {}

    // ----- Accessors -----
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getDepartmentHeadId() { return departmentHeadId; }
    public void setDepartmentHeadId(int departmentHeadId) { this.departmentHeadId = departmentHeadId; }

    public int getOrgId() { return orgId; }
    public void setOrgId(int orgId) { this.orgId = orgId; }
}
