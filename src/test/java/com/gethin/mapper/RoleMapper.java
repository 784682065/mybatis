package com.gethin.mapper;

import com.gethin.po.Role;

/*
 * @author gethin
 */
public interface RoleMapper {
    public Role getRole(Long id);
    public Role findRole(String roleName);
    public int deleteRole(Long id);
    public int insertRole(Role role);
}

