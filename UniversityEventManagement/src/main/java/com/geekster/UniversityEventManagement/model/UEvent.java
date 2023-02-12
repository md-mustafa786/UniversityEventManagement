package com.geekster.UniversityEventManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Time;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UEvent {
    @Id
    private int eventId;
    private String eName;
    private String eLocat;
    private String eDate;
    private String sTime;
    private String endTime;
    private String imgurl;


}
