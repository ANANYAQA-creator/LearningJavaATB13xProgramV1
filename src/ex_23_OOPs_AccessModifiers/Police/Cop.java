package ex_23_OOPs_AccessModifiers.Police;

public class Cop {

public int gun;
private String iCard;

public Cop(int bullet){
    this.gun = bullet;
}

//Method // Behaviour


// private void CanIshoot()  // For Thief it's not accessible [Private]
    protected void CanIshoot() // For junior cop it's accessible[Protected]
 {
    System.out.println("Yes you can..!!");
}
void thisDefault (){
    System.out.println("Hi Cop");
}
}
