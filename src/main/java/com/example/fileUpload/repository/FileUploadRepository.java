package com.example.fileUpload.repository;

import com.example.fileUpload.model.UploadedFiles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileUploadRepository extends JpaRepository<UploadedFiles, Long> {
}
