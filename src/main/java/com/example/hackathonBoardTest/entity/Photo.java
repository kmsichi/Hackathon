package com.example.hackathonBoardTest.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Entity
@Table(name="photo",indexes =
        {
                @Index(columnList = "new_file_name")

        })
public class Photo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Setter @Column
    private String origFileName;

    @Setter @Column
    private String new_file_name;

    @Setter @Column
    private String filePath;

    @Setter @Column
    private Long fileSize;
    @Builder
    public Photo(String origFileName, String new_file_name,String filePath, Long fileSize) {
        this.origFileName = origFileName;
        this.new_file_name=new_file_name;
        this.filePath = filePath;
        this.fileSize = fileSize;
    }
}
