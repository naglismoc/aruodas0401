package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Apartment extends RealEstate{
    public String houseNum;

    public String apartNum;

    public String squareMeters;

    public int roomNum;

    public int apartFloor;

    public int buildingFloor;

    public int buildYear;

    public String houseType;

    public String houseState;

    public int[] warmSystem;

    public String apartmentType;

    public int[] windowsDirection;

    public String houseEfficiency;

    public Apartment(String region, String district, String quartal, String street, String rcNo, boolean interestedChange, boolean auction, String notes_lt, String notes_en, String notes_ru, String[] photos, String video, String tour3d, String price, String phone, String email, boolean dontShowInAds, boolean cbdontWantChat, int accountType, boolean cbagreeToRules, String[] specials, String houseNum, String apartNum, String squareMeters, int roomNum, int apartFloor, int buildingFloor, int buildYear, String houseType, String houseState, int[] warmSystem, String apartmentType, int[] windowsDirection, String houseEfficiency) {
        super(region, district, quartal, street, rcNo, interestedChange, auction, notes_lt, notes_en, notes_ru, photos, video, tour3d, price, phone, email, dontShowInAds, cbdontWantChat, accountType, cbagreeToRules, specials);
        this.houseNum = houseNum;
        this.apartNum = apartNum;
        this.squareMeters = squareMeters;
        this.roomNum = roomNum;
        this.apartFloor = apartFloor;
        this.buildingFloor = buildingFloor;
        this.buildYear = buildYear;
        this.houseType = houseType;
        this.houseState = houseState;
        this.warmSystem = warmSystem;
        this.apartmentType = apartmentType;
        this.windowsDirection = windowsDirection;
        this.houseEfficiency = houseEfficiency;
    }

    @Override
    public void fill() {
        super.fill();

    }



}
