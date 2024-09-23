                                                                                                                                                                                                                                                                                                                                                                                                                                    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.ProTracker.model;

    import java.util.ArrayList;



    /**
     *
     * @author ness
     */
    public class TrackerModel {
        private short sN;
        private String heros;
        private String attackType;
        private String difficulty;
        private String position;
        private String attributes;
        private float baseArmor;
        private short range;
        private short baseHealth;
        private short baseMana;
        private String baseDamage;
        private short mobility;
        private short attackSpeed;
        private float turnRate;
        private float winRate;
        private ArrayList<TrackerModel> TrackerModelList;


      /**
     * Constructor for the TrackerModel class, initializing the object with specified attribute values.
     *
     * @param sN - short value representing the sN (Short Number) attribute
     * @param heros - string representing the heros attribute
     * @param attackType - string representing the attackType attribute
     * @param difficulty - string representing the difficulty attribute
     * @param position - string representing the position attribute
     * @param attributes - string representing the attributes attribute
     * @param baseArmor - float value representing the baseArmor attribute
     * @param range - short value representing the range attribute
     * @param baseHealth - short value representing the baseHealth attribute
     * @param baseMana - short value representing the baseMana attribute
     * @param baseDamage - string representing the baseDamage attribute
     * @param mobility - short value representing the mobility attribute
     * @param attackSpeed - short value representing the attackSpeed attribute
     * @param turnRate - float value representing the turnRate attribute
     * @param winRate - float value representing the winRate attribute
     */  
        public TrackerModel(
                short  sN,String  heros, String  attackType, String  difficulty, String  position, 
                String attributes, float  baseArmor, short  range, short  baseHealth,
                short  baseMana, String  baseDamage, short  mobility, short  attackSpeed,
                float  turnRate,float winRate){

            this.sN = sN;
            this.heros = heros;
            this.attackType = attackType;
            this.difficulty = difficulty;
            this.position = position;
            this.attributes = attributes;
            this.baseArmor = baseArmor;
            this.range = range;
            this.baseHealth = baseHealth;
            this.baseMana = baseMana;
            this.baseDamage = baseDamage;
            this.mobility = mobility;
            this.attackSpeed = attackSpeed;
            this.turnRate = turnRate;
            this.winRate = winRate;

        }

        /**
     * Setter method for setting the sN (Short Number) attribute of the TrackerModel.
     *
     * @param sN - the short value to be set as the sN attribute
     */
    public void setsN(short sN) {
        this.sN = sN;
    }

    /**
     * Setter method for setting the mobility attribute of the TrackerModel.
     *
     * @param mobility - the short value to be set as the mobility attribute
     */
    public void setMobility(short mobility) {
        this.mobility = mobility;
    }

    /**
     * Setter method for setting the heros attribute of the TrackerModel.
     *
     * @param heros - the string value to be set as the heros attribute
     */
    public void setHeros(String heros) {
        this.heros = heros;
    }

    /**
     * Setter method for setting the attackType attribute of the TrackerModel.
     *
     * @param attackType - the string value to be set as the attackType attribute
     */
    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    /**
     * Setter method for setting the difficulty attribute of the TrackerModel.
     *
     * @param difficulty - the string value to be set as the difficulty attribute
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * Setter method for setting the position attribute of the TrackerModel.
     *
     * @param position - the string value to be set as the position attribute
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Setter method for setting the attributes attribute of the TrackerModel.
     *
     * @param attributes - the string value to be set as the attributes attribute
     */
    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    /**
     * Setter method for setting the baseArmor attribute of the TrackerModel.
     *
     * @param baseArmor - the float value to be set as the baseArmor attribute
     */
    public void setBaseArmor(float baseArmor) {
        this.baseArmor = baseArmor;
    }

    /**
     * Setter method for setting the range attribute of the TrackerModel.
     *
     * @param range - the short value to be set as the range attribute
     */
    public void setRange(short range) {
        this.range = range;
    }

    /**
     * Setter method for setting the baseHealth attribute of the TrackerModel.
     *
     * @param baseHealth - the short value to be set as the baseHealth attribute
     */
    public void setBaseHealth(short baseHealth) {
        this.baseHealth = baseHealth;
    }

    /**
     * Setter method for setting the baseMana attribute of the TrackerModel.
     *
     * @param baseMana - the short value to be set as the baseMana attribute
     */
    public void setBaseMana(short baseMana) {
        this.baseMana = baseMana;
    }

    /**
     * Setter method for setting the baseDamage attribute of the TrackerModel.
     *
     * @param baseDamage - the string value to be set as the baseDamage attribute
     */
    public void setBaseDamage(String baseDamage) {
        this.baseDamage = baseDamage;
    }

    /**
     * Setter method for setting the attackSpeed attribute of the TrackerModel.
     *
     * @param attackSpeed - the short value to be set as the attackSpeed attribute
     */
    public void setAttackSpeed(short attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    /**
     * Setter method for setting the turnRate attribute of the TrackerModel.
     *
     * @param turnRate - the float value to be set as the turnRate attribute
     */
    public void setTurnRate(float turnRate) {
        this.turnRate = turnRate;
    }

    /**
     * Setter method for setting the winRate attribute of the TrackerModel.
     *
     * @param winRate - the float value to be set as the winRate attribute
     */
    public void setWinRate(float winRate) {
        this.winRate = winRate;
    }

    /**
     * Getter method for retrieving the sN attribute of the TrackerModel.
     *
     * @return the sN attribute value
     */
    public short getsN() {
        return this.sN;
    }

    /**
     * Getter method for retrieving the heros attribute of the TrackerModel.
     *
     * @return the heros attribute value
     */
    public String getHeros() {
        return this.heros;
    }

    /**
     * Getter method for retrieving the attackType attribute of the TrackerModel.
     *
     * @return the attackType attribute value
     */
    public String getAttackType() {
        return this.attackType;
    }

    /**
     * Getter method for retrieving the difficulty attribute of the TrackerModel.
     *
     * @return the difficulty attribute value
     */
    public String getDifficulty() {
        return this.difficulty;
    }

    /**
     * Getter method for retrieving the position attribute of the TrackerModel.
     *
     * @return the position attribute value
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * Getter method for retrieving the attributes attribute of the TrackerModel.
     *
     * @return the attributes attribute value
     */
    public String getAttributes() {
        return this.attributes;
    }

    /**
     * Getter method for retrieving the ba  seArmor attribute of the TrackerModel.
     *
     * @return the baseArmor attribute value
     */
    public float getBaseArmor() {
        return this.baseArmor;
    }

    /**
     * Getter method for retrieving the range attribute of the TrackerModel.
     *
     * @return the range attribute value
     */
    public short getRange() {
        return this.range;
    }

    /**
     * Getter method for retrieving the baseHealth attribute of the TrackerModel.
     *
     * @return the baseHealth attribute value
     */
    public short getBaseHealth() {
        return this.baseHealth;
    }

    /**
     * Getter method for retrieving the baseMana attribute of the TrackerModel.
     *
     * @return the baseMana attribute value
     */
    public short getBaseMana() {
        return this.baseMana;
    }

    /**
     * Getter method for retrieving the baseDamage attribute of the TrackerModel.
     *
     * @return the baseDamage attribute value
     */
    public String getBaseDamage() {
        return this.baseDamage;
    }

    /**
     * Getter method for retrieving the mobility attribute of the TrackerModel.
     *
     * @return the mobility attribute value
     */
    public short getMobility() {
        return this.mobility;
    }

    /**
     * Getter method for retrieving the attackSpeed attribute of the TrackerModel.
     *
     * @return the attackSpeed attribute value
     */
    public short getAttackSpeed() {
        return this.attackSpeed;
    }

    /**
     * Getter method for retrieving the turnRate attribute of the TrackerModel.
     *
     * @return the turnRate attribute value
     */
    public float getTurnRate() {
        return this.turnRate;
    }

    /**
     * Getter method for retrieving the winRate attribute of the TrackerModel.
     *
     * @return the winRate attribute value
     */
    public float getWinRate() {
        return this.winRate;
    }
    }

