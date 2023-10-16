package adapterPattern;
public class SmartphoneChargerAdapter implements PowerOutlet{
    private final SmartphoneCharger smartphoneCharger;

    public SmartphoneChargerAdapter(SmartphoneCharger smartphoneCharger){
        this.smartphoneCharger = smartphoneCharger;
    }

    @Override
    public String plugIn(){
        return smartphoneCharger.chargePhone();
    }
}