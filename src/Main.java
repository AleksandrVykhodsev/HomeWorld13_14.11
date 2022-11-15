public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(null, 1988, "Минск", "бренд-менеджером");
        Human anna = new Human("Аня", -1993, "Москва", "методистом образовательных программ");
        Human katia = new Human("Катя", 1992, "Калининград", "продакт-менеджером");
        Human artem = new Human("Артем", 1995, "Москва", "директором по развитию бизнеса");
        System.out.println(maksim);
        System.out.println(anna);
        System.out.println(katia);
        System.out.println(artem);
        Car lada = new Car(null, "Granta", "1.7", "желтого", 2015, "России");
        Car audi = new Car("Audi", null, "3,0", "черного", 2020, "Германии");
        Car bmw = new Car("BMW", "Z8", null, "черного" , 2021, "Германии");
        Car kia = new Car("Kia", "Sportage 4-го поколения", "2,4", null, 2018, "Южной Корее");
        Car hyundai = new Car("Hyundai", "Avante", "1,6", "оранжевого", 0, null);
        System.out.println("");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}