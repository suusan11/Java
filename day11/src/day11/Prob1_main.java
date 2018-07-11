package day11;

public class Prob1_main {

	public static void main(String[] args) {
       
        Prob1_CellPhone cp = new Prob1_CellPhone();
        funcPhone(cp);
        funcMailer(cp);
        funcComputer(cp);
    }
   
    public static void funcPhone(Prob1_IPhone phone){
        phone.callPhone();     
        phone.recievePhone();  
    }
   
    public static void funcMailer(Prob1_IMailer mailer){
        mailer.sendMail();     
        mailer.recieveMail();  
    }
    
    public static void funcComputer(Prob1_IComputer computer){
        computer.playGame();    
        computer.borwseWeb();  
    }
 
}
