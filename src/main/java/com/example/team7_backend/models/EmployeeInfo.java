package com.example.team7_backend.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="EmployeeInfo")
public class EmployeeInfo {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Date getProductStartDate() {
        return productStartDate;
    }

    public void setProductStartDate(Date productStartDate) {
        this.productStartDate = productStartDate;
    }

    public Date getProductEndDate() {
        return productEndDate;
    }

    public void setProductEndDate(Date productEndDate) {
        this.productEndDate = productEndDate;
    }

    public Date getResourceProductStartDate() {
        return resourceProductStartDate;
    }

    public void setResourceProductStartDate(Date resourceProductStartDate) {
        this.resourceProductStartDate = resourceProductStartDate;
    }

    public Date getResourceProductEndDate() {
        return ResourceProductEndDate;
    }

    public void setResourceProductEndDate(Date resourceProductEndDate) {
        ResourceProductEndDate = resourceProductEndDate;
    }

    public String getProductBuildLocation() {
        return productBuildLocation;
    }

    public void setProductBuildLocation(String productBuildLocation) {
        this.productBuildLocation = productBuildLocation;
    }

    public boolean isAnchor() {
        return anchor;
    }

    public void setAnchor(boolean anchor) {
        this.anchor = anchor;
    }

    public boolean isWorkIntakeScoping() {
        return workIntakeScoping;
    }

    public void setWorkIntakeScoping(boolean workIntakeScoping) {
        this.workIntakeScoping = workIntakeScoping;
    }

    public boolean isInterviewer() {
        return interviewer;
    }

    public void setInterviewer(boolean interviewer) {
        this.interviewer = interviewer;
    }

    public boolean isSecurityMaven() {
        return securityMaven;
    }

    public void setSecurityMaven(boolean securityMaven) {
        this.securityMaven = securityMaven;
    }

    public boolean isAccessibility() {
        return accessibility;
    }

    public void setAccessibility(boolean accessibility) {
        this.accessibility = accessibility;
    }

    public boolean isDevSecOps() {
        return devSecOps;
    }

    public void setDevSecOps(boolean devSecOps) {
        this.devSecOps = devSecOps;
    }

    public boolean isEducationTrack() {
        return educationTrack;
    }

    public void setEducationTrack(boolean educationTrack) {
        this.educationTrack = educationTrack;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isContractor() {
        return isContractor;
    }

    public void setContractor(boolean contractor) {
        isContractor = contractor;
    }

    public boolean isPersonOfColor() {
        return isPersonOfColor;
    }

    public void setPersonOfColor(boolean personOfColor) {
        isPersonOfColor = personOfColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isAvailableForOtherAreas() {
        return availableForOtherAreas;
    }

    public void setAvailableForOtherAreas(boolean availableForOtherAreas) {
        this.availableForOtherAreas = availableForOtherAreas;
    }

    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    public String getSkill4() {
        return skill4;
    }

    public void setSkill4(String skill4) {
        this.skill4 = skill4;
    }

    public String getSkill5() {
        return skill5;
    }

    public void setSkill5(String skill5) {
        this.skill5 = skill5;
    }

    @Id
    private String name;
    private Date startDate;
    private String role;
    private String roleLevel;
    private String vendor;
    private String product;
    private Date productStartDate;
    private Date productEndDate;
    private Date resourceProductStartDate;
    private Date ResourceProductEndDate;
    private String productBuildLocation;
    private boolean anchor;
    private boolean workIntakeScoping;
    private boolean interviewer;
    private boolean securityMaven;
    private boolean accessibility;
    private boolean devSecOps;
    private boolean educationTrack;
    private String location;
    private boolean isContractor;
    private boolean isPersonOfColor;
    private String gender;
    private boolean availableForOtherAreas;
    private String skill1;
    private String skill2;
    private String skill3;
    private String skill4;
    private String skill5;


}
