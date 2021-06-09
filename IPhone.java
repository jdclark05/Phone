public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return  this.getRingTone() + " - it's your iPhone" + this.getVersion() + "!" + "\n";
    }
    @Override
    public String unlock() {
        return "Unlocking iPhone" + this.getVersion() + " via facial recognition..." + "\n";
    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone" + this.getVersion() + " specs:" + "\n" + "Version: " + this.getVersion() + "\n" + "Battery Percentage: " + this.getBatteryPercentage() + "%" + "\n" + "Carrier: " + this.getCarrier() + "\n" + "RingTone: " + this.getRingTone() + "\n");
    }     
}
