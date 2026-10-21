/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mayorDe;

/**
 *
 * @author espmi
 */
public class MayorDe {
    
    // La decición dependiendo de los valores que ha introducido el usuario.
    public static int mayorde(int n1, int n2, int n3){
        if (n1 > n2 && n1 > n3) {
           return n1;
            } else if (n2 > n3 && n2 > n1){
                return n2;
                    } else {
                        return n3;
                        }
       
    }
}
