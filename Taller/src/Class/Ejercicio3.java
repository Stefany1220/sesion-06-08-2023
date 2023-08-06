
package Class;


public class Ejercicio3 extends Class{

    @Override
    public void Logica() {
        if(this.getNum()<0){
            this.setNum(this.getNum()*-1);
        }
        System.out.println("El valor absoluto del real es: "+this.getNum());
    }
    
}
