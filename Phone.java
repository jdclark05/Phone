public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    
    //getter versionNumber
    public String getVersion(){
        return this.versionNumber;
    }
    //setter versionNumber
    public void setVersion(String vn){
        this.versionNumber = vn;
    }

    //getter batteryPercentage
    public int getBatteryPercentage(){
        return this.batteryPercentage;
    }
    //setter batteryPercentage
    public void setBatteryPercentage(int bp){
        this.batteryPercentage = bp;
    }

    //getter carrier
    public String getCarrier(){
        return this.carrier;
    }
    //setter carrier
    public void setCarrier(String c){
        this.carrier = c;
    }

    //getter ringTone
    public String getRingTone(){
        return this.ringTone;
    }
    //setter ringTone
    public void setRingTone(String rt){
        this.ringTone = rt;
    }
}