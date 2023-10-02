package oop.interfaces.pc;

public class HPWater extends PC implements WaterCollerRGB{
    public HPWater() {
    }

    public HPWater(int ram, String cpu, String GPU, int storage) {
        super(ram, cpu, GPU, storage);
    }

    @Override
    public void tankSize() {
        System.out.println("200ML");
    }

    @Override
    public double tubes() {
        return 1.0;
    }

    @Override
    public boolean isClose() {
        return false;
    }


    @Override
    public void RGBColor() {
        System.out.println("RED , BLUE");
    }
}
