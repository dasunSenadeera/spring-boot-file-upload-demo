package com.example.fileUpload.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@SuppressWarnings("Lombok")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "uploadedfiles")
public class UploadedFiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "upload_file_id")
    private long uploadFileID;


    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public UploadedFiles(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }
}
