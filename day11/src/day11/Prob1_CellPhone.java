package day11;

public class Prob1_CellPhone implements Prob1_IPhone, Prob1_IMailer, Prob1_IComputer {

	public void sendMail(){
        System.out.println("メールを送る");
    }
   
    public void recieveMail(){
        System.out.println("メールを受信する");
    }
   
    public void borwseWeb(){
        System.out.println("ウェブを閲覧する");
    }
   
    public void playGame(){
        System.out.println("ゲームをする");
    }
   
    public void callPhone(){
        System.out.println("電話を掛ける");
    }
   
    public void recievePhone(){
        System.out.println("電話を受ける");
    }
}

