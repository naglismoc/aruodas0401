package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Plot extends RealEstate{
    public String objNo;

    public String plotSize;

    public int[] intendances;

    public Plot(String region, String district, String quartal, String street, String rcNo, boolean interestedChange, boolean auction, String notes_lt, String notes_en, String notes_ru, String[] photos, String video, String tour3d, String price, String phone, String email, boolean dontShowInAds, boolean cbdontWantChat, int accountType, boolean cbagreeToRules, String[] specials, String objNo, String plotSize, int[] intendances) {
        super( region, district, quartal, street, rcNo, interestedChange, auction, notes_lt, notes_en, notes_ru, photos, video, tour3d, price, phone, email, dontShowInAds, cbdontWantChat, accountType, cbagreeToRules, specials);
        this.objNo = objNo;
        this.plotSize = plotSize;
        this.intendances = intendances;
    }

    @Override
    public void fill() {
        super.fill();
        fillIntendances();
    }

    private void fillIntendances() {


        List<WebElement> intendances = driver.findElements(By.xpath("//input[@name='FIntendance[]']/following-sibling::label"));
        for (int i = 0; i < this.intendances.length; i++) {
            switch (this.intendances[i]){
                case 1:
                    intendances.get(0).click();
                    break;
                case 2:
                    intendances.get(1).click();
                    break;
                case 3:
                    intendances.get(2).click();
                    break;
                case 4:
                    intendances.get(3).click();
                    break;
                case 5:
                    intendances.get(4).click();
                    break;
                case 6:
                    intendances.get(5).click();
                    break;
                case 7:
                    intendances.get(6).click();
                    break;
                case 8:
                    intendances.get(7).click();
                    break;
                case 9:
                    intendances.get(8).click();
                    break;
                case 10:
                    intendances.get(9).click();
                    break;
            }
        }
    }



}
