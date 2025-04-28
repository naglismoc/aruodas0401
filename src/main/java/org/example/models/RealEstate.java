package org.example.models;

import org.example.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RealEstate {
    public WebDriver driver;

    public String region;

    public String district;

    public String quartal;

    public String street;

    public String rcNo;

    public boolean interestedChange;

    public boolean auction;

    public String notes_lt;

    public String notes_en;

    public String notes_ru;

    public String[] photos;

    public String video;

    public String tour3d;

    public String price;

    public String phone;

    public String email;

    public boolean dontShowInAds;

    public boolean cbdontWantChat;

    public int accountType;

    public boolean cbagreeToRules;
    public String[] specials;

    public RealEstate() {
    }

    public RealEstate( String region, String district, String quartal, String street, String rcNo, boolean interestedChange, boolean auction, String notes_lt, String notes_en, String notes_ru, String[] photos, String video, String tour3d, String price, String phone, String email, boolean dontShowInAds, boolean cbdontWantChat, int accountType, boolean cbagreeToRules, String[] specials) {
        this.driver = Helper.driver;
        this.region = region;
        this.district = district;
        this.quartal = quartal;
        this.street = street;
        this.rcNo = rcNo;
        this.interestedChange = interestedChange;
        this.auction = auction;
        this.notes_lt = notes_lt;
        this.notes_en = notes_en;
        this.notes_ru = notes_ru;
        this.photos = photos;
        this.video = video;
        this.tour3d = tour3d;
        this.price = price;
        this.phone = phone;
        this.email = email;
        this.dontShowInAds = dontShowInAds;
        this.cbdontWantChat = cbdontWantChat;
        this.accountType = accountType;
        this.cbagreeToRules = cbagreeToRules;
        this.specials = specials;
    }

    public void fill() {
        fillLocation();
        specials();
    }
    public void fillLocation(){
        fillRegion();
        fillDistrict();
        fillQuartal();
        fillStreet();
    }
    private void fillStreet() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(3).click();
        wait(200);
        this.driver.findElement(By.xpath("//*[@id=\"streets_1\"]/li[1]/input")).sendKeys(this.street);//veliau reikes korekciju
        wait(300);
        this.driver.findElement(By.xpath("//*[@id=\"streets_1\"]/li[1]/input")).sendKeys(Keys.ENTER);
    }
    private void fillQuartal() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(2).click();
        this.driver.findElements(By.className("dropdown-input-search-value")).get(1).sendKeys(this.quartal);//veliau reikes korekciju
        wait(2000);
        this.driver.findElements(By.className("dropdown-input-search-value")).get(1).sendKeys(Keys.ENTER);
    }
    private void fillDistrict() { //padaryti veliau
//        this.driver.findElements(By.className("dropdown-input-value-title")).get(1).click();
//        this.driver.findElement(By.className("dropdown-input-search-value")).sendKeys(this.region);
//        this.driver.findElement(By.className("dropdown-input-search-value")).sendKeys(Keys.ENTER);
    }
    private void fillRegion() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(0).click();
        this.driver.findElement(By.className("dropdown-input-search-value")).sendKeys(this.region);
        wait(300);
        this.driver.findElement(By.className("dropdown-input-search-value")).sendKeys(Keys.ENTER);
    }

    public void wait(int time){
        try{
            Thread.sleep(time);
        }catch (Exception e){}
    }

    public void specials(){
        //label[normalize-space(text()) = 'skalbimo mašina']
        driver.findElement(By.id("showMoreFields")).click();
        wait(200);
        for (int i = 0; i < this.specials.length; i++) {
            driver.findElement(By.xpath(
                    "//label[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZĄČĘĖĮŠŲŪŽąčęėįšųūž', 'abcdefghijklmnopqrstuvwxyzaceeisuuzaceeisuuz'), '" + normalizeSpecial(specials[i]) +"')]"
            )).click();
        }
    }

    private String normalizeSpecial(String text) {
        return text.toLowerCase()
                .replace("ą", "a")
                .replace("č", "c")
                .replace("ę", "e")
                .replace("ė", "e")
                .replace("į", "i")
                .replace("š", "s")
                .replace("ų", "u")
                .replace("ū", "u")
                .replace("ž", "z");
    }
}
