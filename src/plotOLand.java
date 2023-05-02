public class plotOLand {
    public String plantName= "jerry";
    public int numberOPlants =2;
    public boolean needsWater = true;


    public plotOLand(){
        //task one: assign a random numebr between 1 and 100
        numberOPlants=(int)(Math.random()*90)+10;
        int plantID = (int)(Math.random()*5);
        if (plantID==0){
            plantName="tomato ";
        } else if (plantID==1){
            plantName="carrot ";
        } else if (plantID==2){
            plantName="lettuce ";
        } else if (plantID==3){
            plantName="tulip ";
        } else  {
            plantName = "empty ";
            numberOPlants=0;
        }

        int waterNeed = (int)(Math.random()*2);
        if(waterNeed==0&&numberOPlants>0){
            needsWater=true;
        } else {
            needsWater=false;
        }

    }
    public void printPlotInfo(){
        System.out.println("--> PLOT INFO <--");
        System.out.println("My plant's name is "+plantName);
        System.out.println("I have "+numberOPlants+" plants");
        System.out.println("It is "+needsWater+" that "+plantName+"needs water");
        System.out.println("");


    }

}
//always need a constructor method

//always need a print method
