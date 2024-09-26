package com.demo.Service;

import com.demo.Entity.admin;
import java.util.List;
import java.util.Optional;

public interface adminService {
    admin saveAdmin(admin admin);
    Optional<admin> getAdminById(Long id);
    List<admin> getAllAdmins();
    void deleteAdmin(Long id);
}
