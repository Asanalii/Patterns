import java.util.Scanner;

public class Books {
    private String name;
    private int price;
    private int days;

     public Books(String name,int price, int days){
         this.name = name;
         this.price = price;
         this.days = days;
     }

     public void identifyPenalty(int days){
         if(days < 30){
             PenaltyCalculationStrategy penaltyCalculationStrategy = new NoPenalty();
             this.price = this.price - penaltyCalculationStrategy.calculatePenalty(price);
         }else if (days>=30 && days <90){
             PenaltyCalculationStrategy penaltyCalculationStrategy = new FivePercent();
             this.price = penaltyCalculationStrategy.calculatePenalty(price);

             penaltyCalculationStrategy.calculatePenalty(this.price);
         } else if (days >= 90 && days < 180 ){
             PenaltyCalculationStrategy penaltyCalculationStrategy = new TenPercent();
             this.price = penaltyCalculationStrategy.calculatePenalty(price);

         } else {
             PenaltyCalculationStrategy penaltyCalculationStrategy = new TwentyPercent();
             this.price = penaltyCalculationStrategy.calculatePenalty(price);

         }
     }

    @Override
    public String toString() {
        return ("You should pay " + price + " dollars for penalty");
    }

//    public String getName() {
//        return name;
//    }
//    public int getPrice() {
//        return price;
//    }
//    public int getTime() {
//        return time;
//    }
//    public void setPrice(int price) {
//        this.price = price;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setTime(int time) {
//        this.time = time;
//    }
}
