public class tes {
    public static void main(String[] args){
        basket obj = new basket(5);
    }
    
}

class Sports{
    Sports(){
        System.out.println("IN Sports Default");
    }

    Sports(int n){
        System.out.println("in Sports parameter");
    }
}

class basket extends Sports{
    basket(){
        System.out.println("In basket Default");
    }
    
    basket(int n){
        System.out.println("In basket parameter");
    }
}