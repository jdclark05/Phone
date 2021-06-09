public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone() + " - it's your Galaxy " + this.getVersion() + "!" + "\n";
    }
    @Override
    public String unlock() {
        return "Unlocking Galaxy " + this.getVersion() + " via finger print..." + "\n";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + this.getVersion() + " specs:" + "\n" + "Version: " + this.getVersion() + "\n" + "Battery Percentage: " + this.getBatteryPercentage() + "%" + "\n" + "Carrier: " + this.getCarrier() + "\n" + "RingTone: " + this.getRingTone() + "\n");            
    }
}
