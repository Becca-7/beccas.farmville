import java.util.ArrayList;

public class MyFarm {

ArrayList<plotOLand> row;
    public static void main(String[] args) {
        System.out.println("hey farmer :)");
        System.out.println();
        MyFarm OldMcDonalds= new MyFarm();

    }
    public MyFarm(){
        row=new ArrayList<>();
for(int i=0; i<10;i++){
 row.add(new plotOLand());
}


totalPlants();
printPlantNames();
addLettuce();
tomatoLocations();
addTulip();
totalCarrots();
averageNumberOfPlants();
numberOfCarrotPlots();
numberOfEmptyPlots();
everyOtherNeedsWater();
printRowInfo();
plantWithMaxNumber();
plantWithMinNumber();
greaterThan10();
plantWithMaxNumberNeedsWater();


    }


    public void totalPlants(){
        int total=0;
        System.out.println("*** TOTAL PLANTS ***");
        for (int i=0; i<row.size(); i++){
            total=total+row.get(i).numberOPlants;
        }
        System.out.println("there are "+total+" plants in this row");

        System.out.println();


    }
    public void printPlantNames() {
        System.out.println("*** PLANT NAMES ***");
        for (int i=0; i<row.size(); i++){
            System.out.println(i+"="+row.get(i).plantName);
        }

        System.out.println();
    }
    public void printRowInfo() {
        System.out.println("*** ROW INFO ***");
        for (int i=0; i<row.size(); i++){
            row.get(i).printPlotInfo();
        }

        System.out.println();

    }
    public void addLettuce() {
      row.add(new plotOLand());
      row.get(10).plantName="lettuce ";
      row.get(10).needsWater=true;
      row.get(10).numberOPlants=42;

        System.out.println();
    }
    public void addTulip() {
    //    row.add(new plotOLand());
row.get(3).plantName="tulip ";
row.get(3).numberOPlants=70;
row.get(3).needsWater=false;

        // at index 3, add a new tulip plot with 70 plants that do not need water

        // call printPlantNames() method before and after your addition to make sure it worked

    }
    public void tomatoLocations() {
        System.out.println("*** WHERE ARE MY TOMATOES? ***");
        for (int i=0; i<row.size(); i++){
           if(row.get(i).plantName=="tomato ") {
               System.out.println("there's a tomato in spot "+i);
           }
        }
        System.out.println();

    }
    public void totalCarrots() {
        System.out.println("*** HOW MANY CARROTS? ***");
        int total = 0;
        for (int i=0; i<row.size(); i++){
            if(row.get(i).plantName=="carrot ") {
                total=total+row.get(i).numberOPlants;

            }
        }
        System.out.println("There are "+total+" carrots");
        System.out.println();


    }
    public void averageNumberOfPlants() {
        System.out.println("*** AVERAGE PLANTS ***");
        int total = 0;
        for (int i=0; i<row.size(); i++) {
            total=total+row.get(i).numberOPlants;
        }
        System.out.println(total/row.size());
        System.out.println();

    }
    public void numberOfCarrotPlots() {
        System.out.println("*** HOW MANY PLOTS OF CARROTS? ***");
        int total = 0;
        for (int i=0; i<row.size(); i++){
            if(row.get(i).plantName=="carrot ") {
                total++;
            }
        }
        System.out.println("There are "+total+" plots with carrots");
        System.out.println();




    }
    public void numberOfEmptyPlots() {
        System.out.println("*** HOW MANY EMPTY PLOTS? ***");
        int total = 0;
        for (int i=0; i<row.size(); i++){
            if(row.get(i).plantName=="empty ") {
                total++;
            }
        }
        System.out.println("There are "+total+" empty plots");
        System.out.println();
    }
    public void everyOtherNeedsWater(){
        System.out.println("*** EVERY OTHER NEED WATER!? ***");
        int total = 0;
        for (int i=0; i<row.size(); i++){
          if (total==0){
              total++;
              row.get(i).needsWater=true;
          } else {
              total--;
              row.get(i).needsWater=false;
          }
        }
        System.out.println();
    }
    public void plantWithMaxNumber() {
        System.out.println("*** WHICH PLANT IS PRODUCING BEST!? ***");
        int tomato = 0;
        int carrot=0;
        int lettuce=0;
        int tulip=0;
        for (int i=0; i<row.size(); i++){
            if(row.get(i).plantName=="carrot ") {
                carrot=carrot+row.get(i).numberOPlants;
            }else if(row.get(i).plantName=="tomato ") {
                tomato=tomato+row.get(i).numberOPlants;
            }else if(row.get(i).plantName=="lettuce ") {
                lettuce=lettuce+row.get(i).numberOPlants;
            } else if(row.get(i).plantName=="tulip ") {
                tulip=tulip+row.get(i).numberOPlants;
            }
        }
      if (tomato>carrot&&tomato>lettuce&&tomato>tulip){
          System.out.println("Tomato has the most plants at "+tomato);
      }else  if (carrot>tomato&&carrot>lettuce&&carrot>tulip){
          System.out.println("Carrot has the most plants at "+carrot);
      } else  if (lettuce>carrot&&tomato<lettuce&&lettuce>tulip){
          System.out.println("Lettuce has the most plants at "+lettuce);
      } else  if (tulip>carrot&&tulip>lettuce&&tomato<tulip){
          System.out.println("Tulip has the most plants at "+tulip);
      }
        System.out.println();
    }
    public void plantWithMinNumber() {
        System.out.println("*** WHICH PLANT IS PRODUCING WORST!? ***");
        int tomato = 0;
        int carrot=0;
        int lettuce=0;
        int tulip=0;
        for (int i=0; i<row.size(); i++){
            if(row.get(i).plantName=="carrot ") {
                carrot=carrot+row.get(i).numberOPlants;
            }else if(row.get(i).plantName=="tomato ") {
                tomato=tomato+row.get(i).numberOPlants;
            }else if(row.get(i).plantName=="lettuce ") {
                lettuce=lettuce+row.get(i).numberOPlants;
            } else if(row.get(i).plantName=="tulip ") {
                tulip=tulip+row.get(i).numberOPlants;
            }
        }
        if (tomato<carrot&&tomato<lettuce&&tomato<tulip){
            System.out.println("Tomato has the least plants at "+tomato);
        }else  if (carrot<tomato&&carrot<lettuce&&carrot<tulip){
            System.out.println("Carrot has the least plants at "+carrot);
        } else  if (lettuce<carrot&&tomato>lettuce&&lettuce<tulip){
            System.out.println("Lettuce has the least plants at "+lettuce);
        } else  if (tulip<carrot&&tulip<lettuce&&tomato>tulip){
            System.out.println("Tulip has the least plants at "+tulip);
        }
        System.out.println();
    }
    public void greaterThan10() {

        System.out.println("*** WHICH PLANT IS PRODUCING AT LEAST SOME!? ***");
        int tomato = 0;
        int carrot=0;
        int lettuce=0;
        int tulip=0;
        for (int i=0; i<row.size(); i++){
            if(row.get(i).plantName=="carrot ") {
                carrot=carrot+row.get(i).numberOPlants;
            }else if(row.get(i).plantName=="tomato ") {
                tomato=tomato+row.get(i).numberOPlants;
            }else if(row.get(i).plantName=="lettuce ") {
                lettuce=lettuce+row.get(i).numberOPlants;
            } else if(row.get(i).plantName=="tulip ") {
                tulip=tulip+row.get(i).numberOPlants;
            }
        }
        if (tomato>10){
            System.out.println("Tomato has more than 10 plants at "+tomato);
        }
        if (carrot>10){
            System.out.println("Carrot has more than 10 plants at "+carrot);
        }
        if (lettuce>10){
            System.out.println("Lettuce has more than 10 plants at "+lettuce);
        }
        if (tulip>10){
            System.out.println("Tulip has more than 10 plants at "+tulip);
        }
        System.out.println();
    }
    public void plantWithMaxNumberNeedsWater(){
        System.out.println("*** WHO'S THIRSTY!? ***");
        int tomato = 0;
        int carrot=0;
        int lettuce=0;
        int tulip=0;
        for (int i=0; i<row.size(); i++){
            if(row.get(i).plantName=="carrot "&&row.get(i).needsWater==true) {
                carrot=carrot+row.get(i).numberOPlants;
            }else if(row.get(i).plantName=="tomato "&&row.get(i).needsWater==true) {
                tomato=tomato+row.get(i).numberOPlants;
            }else if(row.get(i).plantName=="lettuce "&&row.get(i).needsWater==true) {
                lettuce=lettuce+row.get(i).numberOPlants;
            } else if(row.get(i).plantName=="tulip "&&row.get(i).needsWater==true) {
                tulip=tulip+row.get(i).numberOPlants;
            }
        }
        if (tomato>carrot&&tomato>lettuce&&tomato>tulip){
            System.out.println("Tomato has the most plants needing water at "+tomato);
        }else  if (carrot>tomato&&carrot>lettuce&&carrot>tulip){
            System.out.println("Carrot has the most plants needing water at "+carrot);
        } else  if (lettuce>carrot&&tomato<lettuce&&lettuce>tulip){
            System.out.println("Lettuce has the most plants needing water at "+lettuce);
        } else  if (tulip>carrot&&tulip>lettuce&&tomato<tulip){
            System.out.println("Tulip has the most plants needing water at "+tulip);
        }
        System.out.println();
    }
    
}



//public class,
//psvm
//construct an "instance" of the code " MyFarm OldMcDonalds= new MyFarm();" in the main method
//create the main class "public MyFarm(){