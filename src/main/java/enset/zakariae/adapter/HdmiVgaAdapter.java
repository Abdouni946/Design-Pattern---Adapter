package enset.zakariae.adapter;

import enset.zakariae.computer.HDMI;
import enset.zakariae.computer.TV;
import enset.zakariae.computer.VGA;

public class HdmiVgaAdapter implements VGA {
    private HDMI hdmi;

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String message) {
        System.out.println("***********HdmiVgaAdapter*******************");
        hdmi.view(message.getBytes());
        System.out.println("***********HdmiVgaAdapter*******************");
    }
}
