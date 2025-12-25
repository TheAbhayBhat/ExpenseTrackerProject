package com.expense.springboot.expenseTracker.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@MappedSuperclass
@Data
@Getter
@Setter
@Entity
@Builder(toBuilder = true)
public abstract class baseEntity {

    @Column(name="logged_by")
    private long loggedBy;

    @Column(name="last_updated_by")
    private long lastUpdatedBy;

    @Column(name="logged-Date")
    private Timestamp loggedDate;

    @Column(name="lastUpdated-Date")
    private Timestamp lastUpdatedDate;


}
