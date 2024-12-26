package enset.zakariae;

import enset.zakariae.adapter.HdmiVgaAdapter;
import enset.zakariae.computer.Ecran;
import enset.zakariae.computer.TV;
import enset.zakariae.computer.UniteCentre;
import enset.zakariae.computer.VideoProjector;

public class Main {
    public static void main(String[] args) {
        UniteCentre uniteCentre = new UniteCentre();
        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Hello");
        uniteCentre.setVga(new VideoProjector());
        uniteCentre.print("Hello");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);

        hdmiVgaAdapter.print("Hello GLSID 3");
    }
}