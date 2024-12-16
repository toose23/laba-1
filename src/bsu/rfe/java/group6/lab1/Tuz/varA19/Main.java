package bsu.rfe.java.group6.lab1.Tuz.varA19;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main (String args[]) {

        Food[] breakfast = new Food[20];

        int count = 0;

        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[count] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[count] = new Apple(parts[1]);
            } else if (parts[0].equals("IceCream"))
                breakfast[count] = new IceCream(parts[1]);
            count++;
        }


        Food cheese = new Cheese();
        int CheeseCount = countProductsByType(breakfast, cheese);
        System.out.println("Количество мороженого в меню: " + CheeseCount);



        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            }
          else{  break;}
        }

    }
    public static int countProductsByType(Food[] breakfast, Food typeToCount) {
        int count = 0;
        for (Food item : breakfast) {
            if (item != null && item.equals(typeToCount)) {
                count++;
            }
        }
        return count;
    }
}

