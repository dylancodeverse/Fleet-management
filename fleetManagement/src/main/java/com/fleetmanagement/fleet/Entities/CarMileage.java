package com.fleetmanagement.fleet.Entities;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class CarMileage 
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private Long carMileageId ;

    @CreationTimestamp
    private Timestamp createdDate ;

    @Column(nullable = false)
    private double departureKm ;

    private double arrivalKm ;

    @ManyToOne(cascade = CascadeType.ALL)
    private Car car ;



    public Long getCarMileageId() 
    {
        return carMileageId;
    }

    public void setCarMileageId(Long carMileageId) 
    {
        this.carMileageId = carMileageId;
    }

    public Timestamp getCreatedDate() 
    {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) 
    {
        this.createdDate = createdDate;
    }

    public double getDepartureKm() 
    {
        return departureKm;
    }

    public void setDepartureKm(double departureKm) 
    {
        this.departureKm = departureKm;
    }

    public double getArrivalKm() 
    {
        return arrivalKm;
    }

    public void setArrivalKm(double arrivalKm) 
    {
        this.arrivalKm = arrivalKm;
    }


}