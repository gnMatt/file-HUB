public class Droid {
    //instance variables
    String name;
    int batteryLevel;


    public Droid (String droidName){
        name = droidName;
        batteryLevel = 100;

    }
    
    public void doTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public void dispBatteryLvl(){

    }
    public void energyReport(){
        System.out.println(batteryLevel);
    }

    public String toString(){
        return "Hello!, I am " + name + " the Droid";
    }
 
    public static void main(String[] args){
        Droid Codey = new Droid("Codey");
        System.out.println(Codey);
        Codey.doTask("flying");
        Codey.doTask("dancing");
        Codey.doTask("jaboling");
        Codey.energyReport();
    }


}
