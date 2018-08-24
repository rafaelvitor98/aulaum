
package aulaum;

public class Carro {
    public String Marca;
    public String Modelo;
    public String Cor;
    public int Ano;
    public int AnoFabricação;
    public boolean Andando;
    
    public void Andar () {
        this.Andando = true;
                
    }
    public void Frear (){
        this.Andando = false;
    }
    
    public void AcaoCarro(boolean andar, String Marca){
        if (andar) {
            System.out.println(Marca + ", Esta Andando");
            
        } else {
            System.out.println(Marca + ", Esta Parado");
        }
    }


        
    }



