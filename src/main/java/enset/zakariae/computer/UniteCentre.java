package enset.zakariae.computer;

public class UniteCentre {
    private VGA vga;
    public void print( String message){
        System.out.println("**********UniteCentre************");
        vga.print(message);
        System.out.println("**********UniteCentre************");
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
