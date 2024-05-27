/*
Author: Thanos Moschou
Description: This is a rest api used for mobile assignment of UoM in the 2023-2024 spring semester.
*/

package com.example.backend_rcl.repositories;

import com.example.backend_rcl.model.RecycleRequestListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecycleRequestListItemsRepository extends JpaRepository<RecycleRequestListItem, String> {
}
