public class Car
{
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country)
    {
        if (brand == null || brand.equals(""))
        {
            this.brand = "default";
        }
        else
        {
            this.brand = brand;
        }
        if (model == null || model.equals(""))
        {
            this.model = "default";
        }
        else
        {
            this.model = model;
        }
        if (country == null || country.equals(""))
        {
            this.country = "default";
        }
        else
        {
            this.country = country;
        }
        if (engineVolume > 0)
        {
            this.engineVolume = engineVolume;
        }
        else
        {
            this.engineVolume = 1.5;
        }
        if (color == null || color.equals(""))
        {
            this.color = "белый";
        }
        else
        {
            this.color = color;
        }
        if (year > 0)
        {
            this.year = year;
        }
        else
        {
            this.year = 2000;
        }
    }

    @Override
    public String toString()
    {
        String a = "Модель: " + this.brand + "\n" + "Модель: " + this.model + "\n" + "Объём двигателя в литрах: " + this.engineVolume + "\n" + "Цвет кузова: " + this.color + "\n" + "Год производства: " + this.year + "\n" + "Страна сборки: " + this.country;
        return a;
    }
}
