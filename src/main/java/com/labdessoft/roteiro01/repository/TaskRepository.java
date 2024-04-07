package com.labdessoft.roteiro01.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.labdessoft.roteiro01.Entity.Task;
public interface TaskRepository extends JpaRepository<Task, Long>
{
}
