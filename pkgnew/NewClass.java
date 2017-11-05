/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

/**
 *
 * @author Tosun Pasha
 */
public class NewClass {
    String defaultLaugh;
    int nLaughs;
    

public NewClass(){}

public NewClass(String dLaugh, int nL){
defaultLaugh = dLaugh;
nLaughs = nL;
}
public void Laugh(){
    for(int i = 0; i < nLaughs; i++)
        System.out.println(defaultLaugh);
}
}

