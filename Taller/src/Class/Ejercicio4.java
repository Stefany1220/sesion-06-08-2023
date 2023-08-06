
package Class;


public class Ejercicio4 extends Class{

    @Override
    public void Logica() {
        if(this.getNum()==0){
            System.out.println("El real es neutro.");
        }if(this.getNum()<0){
            System.out.println("El real es negativo.");
        }else{
            System.out.println("El real es positivo.");
        }
    }
    
}
