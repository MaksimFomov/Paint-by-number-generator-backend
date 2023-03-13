package com.fomov.Paint.by.number.generator.model;

import jakarta.persistence.*;

@Entity
public class RoleHasPermission {
    @Id
    @ManyToOne
    private Role roleId;
    @ManyToOne
    private Permission permissionId;
}
