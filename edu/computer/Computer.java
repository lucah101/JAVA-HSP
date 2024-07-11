package com.edu.computer;

public class Computer {
    private String cpu;
    private String memory;
    private String harddisk;

    public String getDetails(){
        return cpu + "\t" +memory+ "\t" + harddisk;
    }

    public Computer(String cpu, String memory, String harddisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.harddisk = harddisk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }
}
