package com.cybertek.repository;

import com.cybertek.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

    // In
    @Query("SELECT d FROM Department d WHERE d.division IN ?1")
    List<Department> getDepartmentByDivisionIn(List<String> divisions);

    List<Department> retrieveDepartmentByDivision(String division);

    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContains(String pattern);

}
