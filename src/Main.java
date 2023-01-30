public class Main
{
    public static void main(String[] args)
    {
        Car lada = new Car("Lada","Granta",1.7,"жёлтый",2015, "Россия");
        Car audi = new Car("Audi","A8 50 L TDI quattro",3,"чёрный",2020, "Германия");
        Car bmw = new Car("BMW","Z8",3,"чёрный",2021, "Германия");
        Car kia = new Car("Kia","Sportage 4-го поколения",2.4,"красный",2018, "Южная Корея");
        Car hyundai = new Car("Hyundai","Avante",1.6,"ораньжевый",2016, "Южная Корея");
        System.out.println(lada.toString() + "\n");
        System.out.println(audi.toString() + "\n");
        System.out.println(bmw.toString() + "\n");
        System.out.println(kia.toString() + "\n");
        System.out.println(hyundai.toString() + "\n");
    }
}