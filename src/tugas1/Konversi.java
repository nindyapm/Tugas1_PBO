package tugas1;

public class Konversi {
    int suhu; //deklarasi atribut
   
    public Konversi(int suhu) { //constructor
       this.suhu = suhu;
    }
    
    void tampil () { //fungsi menampilkan hasil konversi
            System.out.println("\nSuhu Dalam Celsius  : " + suhu + "°C");
            System.out.println("Dalam Fahrenheit    : " + fahrenheit() + "°F");
            System.out.println("Dalam Reamur        : " + reamur() + "°R");
            System.out.println("Dalam Kelvin        : " + kelvin() + "K");
            
            if (suhu <= 0) {
                System.out.println("Kondisi Air Beku.");
            } 
            else if (suhu > 0 & suhu < 100) {
                System.out.println("Kondisi Air Normal.");
            }
            else if (suhu >= 100) {
                System.out.println("Kondisi Air Mendidih.");
            }
    }
    
    double fahrenheit() {
        return (9 * suhu)/5 + 32;
    }
    
    double reamur() {
        return (4 * suhu)/5;
    }
    
    double kelvin() {
        return suhu + 273.15;
    }
}
