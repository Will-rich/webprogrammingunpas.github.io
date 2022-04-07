public class HelloWorld{
  public static void main(String[] args){
    
    try( Scanner input = new Scanner(System.in)){
      System.out.print("Saya ingin menulis : ");
      String text = Input.NextInt();
      System.out.print(text);
    }
