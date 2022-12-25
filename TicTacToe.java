import java.awt.*;
import java.awt.event.*;
public class TicTacToe implements ActionListener,WindowListener {
    private Frame f;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset,resultButton;
    int count=0;
    String letter;
    public TicTacToe(){
        f=new Frame("Tic tac toe");
        f.setSize(400,500);
        f.setBackground(Color.YELLOW);


        b1=new Button();
        b1.setBounds(50,50,100,100);
        
        b2=new Button();
        b2.setBounds(150,50,100,100);

        b3=new Button();
        b3.setBounds(250,50,100,100);

        b4=new Button();
        b4.setBounds(50,150,100,100);

        b5=new Button();
        b5.setBounds(150,150,100,100);

        b6=new Button();
        b6.setBounds(250,150,100,100);

        b7=new Button();
        b7.setBounds(50,250,100,100);

        b8=new Button();
        b8.setBounds(150,250,100,100);

        b9=new Button();
        b9.setBounds(250,250,100,100);

        reset=new Button("Reset");
        reset.setBounds(150,380,100,50);

        
    }
    public void launchGame(){
        f.addWindowListener(this);
        f.setVisible(true);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(reset);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        reset.addActionListener(this);

 
    }
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }

    public void actionPerformed(ActionEvent e){
        count++;
        if(count==1||count==3||count==5||count==7||count==9){
            letter="X";
        }
        if(count==2||count==4||count==6||count==8){
            letter="O";
        }

        if(e.getSource()==b1){
            b1.setLabel(letter);
            b1.setEnabled(false);
            b1.setBackground(Color.white);
            
        }
        if(e.getSource()==b2){
            b2.setLabel(letter);
            b2.setEnabled(false);
            b2.setBackground(Color.white);
        }
        if(e.getSource()==b3){
            b3.setLabel(letter);
            b3.setEnabled(false);
            b3.setBackground(Color.white);
        }
        if(e.getSource()==b4){
            b4.setLabel(letter);
            b4.setEnabled(false);
            b4.setBackground(Color.white);
        }
        if(e.getSource()==b5){
            b5.setLabel(letter);
            b5.setEnabled(false);
            b5.setBackground(Color.white);
        }
        if(e.getSource()==b6){
            b6.setLabel(letter);
            b6.setEnabled(false);
            b6.setBackground(Color.white);
        }
        if(e.getSource()==b7){
            b7.setLabel(letter);
            b7.setEnabled(false);
            b7.setBackground(Color.white);
        }
        if(e.getSource()==b8){
            b8.setLabel(letter);
            b8.setEnabled(false);
            b8.setBackground(Color.white);
        }
        if(e.getSource()==b9){
            b9.setLabel(letter);
            b9.setEnabled(false);
            b9.setBackground(Color.white);
        }
        if(e.getSource()==reset){

            resultButton.setVisible(false);

            letter="";
            count=0;
            b1.setEnabled(true);
            b1.setLabel("");
            b1.setBackground(null);
            b2.setEnabled(true);
            b2.setLabel("");
            b2.setBackground(null);
            b3.setEnabled(true);
            b3.setLabel("");
            b3.setBackground(null);
            b4.setEnabled(true);
            b4.setLabel("");
            b4.setBackground(null);
            b5.setEnabled(true);
            b5.setLabel("");
            b5.setBackground(null);
            b6.setEnabled(true);
            b6.setLabel("");
            b6.setBackground(null);
            b7.setEnabled(true);
            b7.setLabel("");
            b7.setBackground(null);
            b8.setEnabled(true);
            b8.setLabel("");
            b8.setBackground(null);
            b9.setEnabled(true);
            b9.setLabel("");
            b9.setBackground(null);

            

            

        }

        if(b1.getLabel()==b2.getLabel() && b2.getLabel()==b3.getLabel() && b1.getLabel()!="" && b2.getLabel()!="" && b3.getLabel()!=""){
            resultButton=new Button(b1.getLabel()+"  is win!");
            resultButton.setBounds(50,440,300,50);
            resultButton.setVisible(true);
            f.add(resultButton);

            b1.setBackground(Color.green);
            b2.setBackground(Color.green);
            b3.setBackground(Color.green);


        }
        else if(b4.getLabel()==b5.getLabel() && b5.getLabel()==b6.getLabel() && b4.getLabel()!="" && b5.getLabel()!="" && b6.getLabel()!=""){
            resultButton=new Button(b4.getLabel()+"  is win!");
            resultButton.setBounds(50,440,300,50);
            resultButton.setVisible(true);
            f.add(resultButton);
            b4.setBackground(Color.green);
            b5.setBackground(Color.green);
            b6.setBackground(Color.green);
        }
        else if(b7.getLabel()==b8.getLabel() && b8.getLabel()==b9.getLabel() && b7.getLabel()!="" && b8.getLabel()!="" && b9.getLabel()!=""){
            resultButton=new Button(b7.getLabel()+"  is win!");
            resultButton.setBounds(50,440,300,50);
            resultButton.setVisible(true);
            f.add(resultButton);
            b7.setBackground(Color.green);
            b8.setBackground(Color.green);
            b9.setBackground(Color.green);
        }
        else if(b1.getLabel()==b4.getLabel() && b4.getLabel()==b7.getLabel() && b1.getLabel()!="" && b4.getLabel()!="" && b7.getLabel()!=""){
            resultButton=new Button(b1.getLabel()+"  is win!");
            resultButton.setBounds(50,440,300,50);
            resultButton.setVisible(true);
            f.add(resultButton);
            b1.setBackground(Color.green);
            b4.setBackground(Color.green);
            b7.setBackground(Color.green);
        }
        else if(b2.getLabel()==b5.getLabel() && b5.getLabel()==b8.getLabel() && b2.getLabel()!="" && b5.getLabel()!="" && b8.getLabel()!=""){
            resultButton=new Button(b2.getLabel()+"  is win!");
            resultButton.setBounds(50,440,300,50);
            resultButton.setVisible(true);
            f.add(resultButton);
            b2.setBackground(Color.green);
            b5.setBackground(Color.green);
            b8.setBackground(Color.green);
        }
        else if(b3.getLabel()==b6.getLabel() && b6.getLabel()==b9.getLabel() && b3.getLabel()!="" && b6.getLabel()!="" && b9.getLabel()!=""){
            resultButton=new Button(b3.getLabel()+"  is win!");
            resultButton.setBounds(50,440,300,50);
            resultButton.setVisible(true);
            f.add(resultButton);
            b3.setBackground(Color.green);
            b6.setBackground(Color.green);
            b9.setBackground(Color.green);
        }
        else if(b1.getLabel()==b5.getLabel() && b5.getLabel()==b9.getLabel() && b1.getLabel()!="" && b5.getLabel()!="" && b9.getLabel()!=""){
            resultButton=new Button(b1.getLabel()+"  is win!");
            resultButton.setBounds(50,440,300,50);
            resultButton.setVisible(true);
            f.add(resultButton);
            b1.setBackground(Color.green);
            b5.setBackground(Color.green);
            b9.setBackground(Color.green);
        }   
        else if(b3.getLabel()==b5.getLabel() && b5.getLabel()==b7.getLabel() && b3.getLabel()!="" && b5.getLabel()!="" && b7.getLabel()!=""){
            resultButton=new Button(b3.getLabel()+"  is win!");
            resultButton.setBounds(50,440,300,50);
            resultButton.setVisible(true);
            f.add(resultButton);
            b3.setBackground(Color.green);
            b5.setBackground(Color.green);
            b7.setBackground(Color.green);
        }
        else if(b1.getLabel()!="" && b2.getLabel()!="" && b3.getLabel()!="" && b4.getLabel()!="" && b5.getLabel()!="" && b6.getLabel()!="" && b7.getLabel()!="" && b8.getLabel()!="" && b9.getLabel()!=""){
            resultButton=new Button("Draw!");
            resultButton.setBounds(50,440,300,50);
            resultButton.setVisible(true);
            f.add(resultButton);
        }

    }

    public static void main(String[] args) {
        TicTacToe t=new TicTacToe();
        t.launchGame();
    }

}
