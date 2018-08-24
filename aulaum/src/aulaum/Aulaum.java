package aulaum;

public class Aulaum {

    public static void main(String[] args) {
        Carro car = new Carro();
        car.Marca = "Toyota";
        car.Ano = 2018;
        car.Andar();
        
        car.AcaoCarro (car.Andando, car.Marca);
        Carro car2 = new Carro();
        car2.Marca = "Fiat";
        car2.Ano = 2018;
        car2.Frear();
        car2.AcaoCarro (car2.Andando, car2.Marca);
        
        car.AcaoCarro (car.Andando, car.Marca);
        Carro car3 = new Carro();
        car3.Marca = "Chevrolet";
        car3.Ano = 2018;
        car3.Frear();
        car3.AcaoCarro (car3.Andando, car3.Marca);
        
         car.AcaoCarro (car.Andando, car.Marca);
        Carro car4 = new Carro();
        car4.Marca = "Ford";
        car4.Ano = 2018;
        car4.Frear();
        car4.AcaoCarro (car4.Andando, car4.Marca);
        
        
        
        
    }

}
