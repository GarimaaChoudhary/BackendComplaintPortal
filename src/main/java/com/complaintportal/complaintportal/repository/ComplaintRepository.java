package com.complaintportal.complaintportal.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.complaintportal.complaintportal.model.Complaint;




public interface ComplaintRepository extends JpaRepository<Complaint,Long>{
	@Query("SELECT c FROM Complaint c WHERE c.user.id =:userId")
	public List<Complaint>getUsersComplaints(@Param("userId")Long userId);
}
