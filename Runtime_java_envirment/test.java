 class Runtime1{  
 public static void main(String args[])throws Exception{  
  Runtime.getRuntime().exec("cd ~/java && mkdir createForTesting && cd createForTesting && touch test.txt");//will open a new notepad  
 }  
}
